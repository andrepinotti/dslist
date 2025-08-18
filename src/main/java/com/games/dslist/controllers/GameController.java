package com.games.dslist.controllers;

import java.util.List;
import com.games.dslist.services.GameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.games.dslist.entities.Game;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
    private GameService gameService;

	@GetMapping
	public List<Game> findAll(){
		return gameService.findAll();
	}
	
}
