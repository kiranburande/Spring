package com.kiran.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator 
{
	private LocalTime time;
	private LocalDate date;
	
	public WishMessageGenerator()
	{
		System.out.println("WishMessageGenerator::0-arg-constructors");
	}
	public void setDate(LocalDate date) {
		System.out.println("WishMessagegenerator.setDate()");
		this.date = date;
	}

	public void setTime(LocalTime time) {
		System.out.println("WishMessagegenerator.setTime()");
		this.time = time;
	}
	
	public String showWishMessage(String user)
	{
		System.out.println("WishMessagegenerator.showWishMessage()");
		int hour = time.getHour();
		if(hour<12) 
			return "Good Morning"+user;
		else if(hour<16)
			return "Good Afternoon"+user;
		else if(hour<20)
			return "Good Evening"+user;
		else 
			return "Good Night"+user;
	}

}
