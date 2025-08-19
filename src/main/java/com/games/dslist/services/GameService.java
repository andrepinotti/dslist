package com.games.dslist.services;

import java.beans.Transient;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.games.dslist.dto.GameDTO;
import com.games.dslist.dto.GameMinDTO;
import com.games.dslist.entities.Game;
import com.games.dslist.repositories.GameRepository;


@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(GameMinDTO::new).toList();
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long gameId) {
		Game result = gameRepository.findById(gameId).get();
		return new GameDTO(result);
	}
	
}
