package com.mvvieira.dslist.controllers;


import com.mvvieira.dslist.dto.GameListDTO;
import com.mvvieira.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    // GET ALL - /lists
    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

}
