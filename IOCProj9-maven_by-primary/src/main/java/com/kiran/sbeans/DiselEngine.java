package com.kiran.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dEngine")

public class DiselEngine implements IEngine {

	@Override
	public void startEngine() {

		System.out.println("Disel engine is started....");
	}

	@Override
	public void stopEngine() {
		System.out.println("Disel engine is stopped....");
		
	}

}
