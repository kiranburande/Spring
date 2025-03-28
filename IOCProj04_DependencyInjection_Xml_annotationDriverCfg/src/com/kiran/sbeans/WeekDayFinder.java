package com.kiran.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDayFinder 
{
	private LocalDate date;

	public WeekDayFinder() {
		System.out.println("WeekDayFinder::0-arg-Constructor");
	}

	@Autowired
	public void setDate(LocalDate date) {
		System.out.println("WeekDayFinder.setDate()");
		this.date = date;
	}
	public String showDayOfWeek(String user)
	{
		System.out.println("WeekDayFinder.showDayOfWeek()");
	    int wdn = date.getDayOfWeek().getValue();
	    
	    if(wdn>5)  return "Relax::"+user;
	    else   return "Work-Hard::"+user;
	}
	
}
