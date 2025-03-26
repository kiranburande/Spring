package com.kiran.sbeans;

import java.time.LocalDate;

public class WishMessageGenerator 
{
	private LocalDate date ;

	public WishMessageGenerator() 
	{
		System.out.println("WishMessageGenerator::0-arg-constructors");
	}

	public void setDate(LocalDate date) 
	{
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}
	public String showSeason()
	{
		int month = date.getMonthValue();
		System.out.println("WishMessageGenerator.showSeason()");
		if(month>12)
			return "Invallid Month";
		else if(month==1 || month>=10)
			return "Winter";
		else if(month <=5)
			return "Summer";
		else if(month <=9)
			return "Rainy";
		else return "Invallid Month";
	}
}
