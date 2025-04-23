package com.kiran.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kiran.config.AppConfig;
import com.kiran.sbeans.Vehicle;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Vehicle vehicle =ctx.getBean("vehicle",Vehicle.class);
		ctx.close();
	
		vehicle.showVehicleStatus("Hyd", "pune");
	}

}
