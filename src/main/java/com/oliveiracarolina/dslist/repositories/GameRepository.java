package com.oliveiracarolina.dslist.repositories;

import com.oliveiracarolina.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
