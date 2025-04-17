package com.kiran.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDayFinder 
{
	@Autowired
	private LocalDate date;

	public WeekDayFinder() {
		super();
		System.out.println("WeekDayFinder::0arg constructor"); 
	}
	public String showMessageOnDayOfTheWeek(String user)
	{
		System.out.println("WeekDayFinder.showMessageOnDayOfTheWeek()");
		int wno = date.getDayOfWeek().getValue();
		if(wno <= 5)
		{
			return "Work Hard:: "+user;
		}
		else
			return "Relax:"+user;
	}
	
}
