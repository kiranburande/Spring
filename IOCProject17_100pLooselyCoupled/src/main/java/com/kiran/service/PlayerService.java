package com.kiran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.kiran.sbeans.Player;

@Service("playerService")
public class PlayerService 
{
	@Autowired
	private Player player; 
	
	public void displayPlayerInfo()
	{
		System.out.println("Player Id :"+player.getPlayerId());
		System.out.println("Player Name :"+player.getPlayerName());
		System.out.println("Player yearsNumber :"+player.getYearsNumber());
		System.out.println("Player Team Name :"+player.getTeamName());
	}
}
