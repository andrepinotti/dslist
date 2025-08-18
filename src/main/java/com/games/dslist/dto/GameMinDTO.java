package com.games.dslist.dto;

import com.games.dslist.entities.Game;

public class GameMinDTO {

	private Long id; 
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {
	}

	public GameMinDTO(Game gameEntity) {
		super();
		this.id = gameEntity.getId();
		this.title = gameEntity.getTitle();
		this.year = gameEntity.getYear();
		this.imgUrl = gameEntity.getImgUrl();
		this.shortDescription = gameEntity.getShortDescription();
	}
	
	
}
