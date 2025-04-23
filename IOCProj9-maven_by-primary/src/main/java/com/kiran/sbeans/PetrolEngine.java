package com.kiran.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pEngine")
@Primary
public class PetrolEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("Petrol engine is started...");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("Petrol engine is stopped...");
		
	}

}
