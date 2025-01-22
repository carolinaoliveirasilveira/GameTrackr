package com.oliveiracarolina.dslist.repositories;

import com.oliveiracarolina.dslist.entities.Game;
import com.oliveiracarolina.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
