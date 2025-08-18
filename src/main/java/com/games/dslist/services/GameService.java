package com.games.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.games.dslist.dto.GameMinDTO;
import com.games.dslist.entities.Game;
import com.games.dslist.repositories.GameRepository;

@Service
public class GameService {

	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		return gameRepository.findAll();
	}
	
}
