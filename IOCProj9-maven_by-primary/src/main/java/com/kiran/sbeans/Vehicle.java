package com.kiran.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	
	@Autowired
	private IEngine engine;
	
	public void showVehicleStatus(String start,String end) throws InterruptedException
	{
		engine.startEngine();
		System.out.println("Vehicle is going from "+start+ "to" +end+" point");
		Thread.sleep(2000);
		System.out.println("Vehicle is reached to "+end+" point");
		engine.stopEngine();
	}

}
