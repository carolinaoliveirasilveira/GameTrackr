package com.oliveiracarolina.dslist.service;

import com.oliveiracarolina.dslist.dto.GameListDto;
import com.oliveiracarolina.dslist.dto.GameMinDTO;
import com.oliveiracarolina.dslist.entities.Game;
import com.oliveiracarolina.dslist.entities.GameList;
import com.oliveiracarolina.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDto> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDto(x)).toList();
    }
}
