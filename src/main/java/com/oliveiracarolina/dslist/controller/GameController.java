package com.oliveiracarolina.dslist.controller;

import com.oliveiracarolina.dslist.dto.GameMinDTO;
import com.oliveiracarolina.dslist.entities.Game;
import com.oliveiracarolina.dslist.repositories.GameRepository;
import com.oliveiracarolina.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;


    }
}
