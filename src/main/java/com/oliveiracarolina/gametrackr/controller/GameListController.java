package com.oliveiracarolina.gametrackr.controller;

import com.oliveiracarolina.gametrackr.dto.GameListDto;
import com.oliveiracarolina.gametrackr.dto.GameMinDTO;
import com.oliveiracarolina.gametrackr.dto.ReplacementDto;
import com.oliveiracarolina.gametrackr.service.GameListService;
import com.oliveiracarolina.gametrackr.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameListDto> findAll() {
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDto body) {
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());

    }
}
