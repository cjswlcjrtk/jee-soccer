package com.soccer.web.domains;

import java.io.Serializable;

import lombok.Data;

@Data
public class PlayerBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String playername, //id
		playerId,
		teamId,
		ePlayerName,
		nickname,
		joinYYYY,
		position,
		backNo,
		nation,
		birthDate,
		solar, //pw
		height,
		weghit;

	public void setAttribute(String string, PlayerBean player) {
		
	}
	
}
