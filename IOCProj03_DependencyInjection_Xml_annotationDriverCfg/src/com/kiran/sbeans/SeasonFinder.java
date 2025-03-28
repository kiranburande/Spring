package com.kiran.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder 
{
	private LocalDate date;

	public SeasonFinder() {
		System.out.println("SeasonFinder::0arg-Constructor");
	}

	@Autowired
	public void setDate(LocalDate date) {
		System.out.println("SeasonFinder.setDate()");
		this.date = date;
	}
	
	public String showSeasonName()
	{
		System.out.println("SeasonFinder.showSeasonName()");
		int month = date.getMonthValue();
		if(month >=10 || month<=1) return "Winter Season";
		else if(month >= 6) return "Rainy Season";
		else return "Summer Season";
	}
}
