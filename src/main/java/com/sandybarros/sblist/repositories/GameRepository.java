package com.sandybarros.sblist.repositories;

import com.sandybarros.sblist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
