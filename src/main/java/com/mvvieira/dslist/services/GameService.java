package com.mvvieira.dslist.services;

import com.mvvieira.dslist.dto.GameDTO;
import com.mvvieira.dslist.dto.GameMinDTO;
import com.mvvieira.dslist.entities.Game;
import com.mvvieira.dslist.projections.GameMinProjection;
import com.mvvieira.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    // GET ALL
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

    // GET BY ID
    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    // GET BY LISTS
    @Transactional(readOnly = true)
    public List<GameMinDTO> findByLists(Long id) {
        List<GameMinProjection> result = gameRepository.searchByList(id);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
