package com.kiran.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("player")
@PropertySource(value="com/kiran/commons/player.properties")
@Data
public class Player 
{
	@Value("${player.id}")
	private int playerId;
	@Value("${player.name}")
	private String playerName;
	@Value("${player.yearsNumber}")
	private int yearsNumber;
	@Value("${team.name}")
	private String teamName;

}
