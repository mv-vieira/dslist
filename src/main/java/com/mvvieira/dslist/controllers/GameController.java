package com.mvvieira.dslist.controllers;


import com.mvvieira.dslist.dto.GameDTO;
import com.mvvieira.dslist.dto.GameMinDTO;
import com.mvvieira.dslist.entities.Game;
import com.mvvieira.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    // GET ALL - /games
    @GetMapping
    public List<GameMinDTO> findAll(){
       return gameService.findAll();
    }

    //GET BY ID - /games/id
    @GetMapping("/{id}")
    public GameDTO findById(@PathVariable Long id){
        return gameService.findById(id);
    }
}
