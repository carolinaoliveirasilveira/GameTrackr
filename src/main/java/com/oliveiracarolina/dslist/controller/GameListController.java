package com.oliveiracarolina.dslist.controller;

import com.oliveiracarolina.dslist.dto.GameListDto;
import com.oliveiracarolina.dslist.dto.GameMinDTO;
import com.oliveiracarolina.dslist.dto.ReplacementDto;
import com.oliveiracarolina.dslist.service.GameListService;
import com.oliveiracarolina.dslist.service.GameService;
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
