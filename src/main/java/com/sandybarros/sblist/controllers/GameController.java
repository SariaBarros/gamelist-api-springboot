package com.sandybarros.sblist.controllers;


import com.sandybarros.sblist.dto.GameMinDTO;
import com.sandybarros.sblist.entities.Game;
import com.sandybarros.sblist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/games")
public class GameController {
    @Autowired
    private GameService gameService;
    @GetMapping
    public List<GameMinDTO> findAll(){
        return gameService.findAll();
    }
}
