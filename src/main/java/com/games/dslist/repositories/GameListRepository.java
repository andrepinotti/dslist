package com.games.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.games.dslist.GameMinProjection;
import com.games.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
	
}
