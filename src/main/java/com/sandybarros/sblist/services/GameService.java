package com.sandybarros.sblist.services;

import com.sandybarros.sblist.dto.GameMinDTO;
import com.sandybarros.sblist.entities.Game;
import com.sandybarros.sblist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> listGames = gameRepository.findAll();
        return listGames.stream().map(GameMinDTO::new).toList();
    }

}
