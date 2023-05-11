package com.mvvieira.dslist.dto;

import com.mvvieira.dslist.entities.GameList;
import org.springframework.beans.BeanUtils;

public class GameListDTO {
    private Long id;
    private String name;

    GameListDTO(){}

    public GameListDTO(GameList entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
