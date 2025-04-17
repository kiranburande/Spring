package com.kiran.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart
{
	@Autowired
	@Qualifier("bDart")
	private ICourior courior;

	public Flipkart() {
		System.out.println("Flipkart::0-param Constructor");
	}

	public String shopping(String items[],double prices[])
	{
		System.out.println("Flipkart.shopping()");
		double billAMt=0.0;
		for(double p : prices)
		{
			billAMt = billAMt+p;
		}

		int oid = new Random().nextInt(100000);
		String msg = courior.deliver(oid);

		return Arrays.toString(items)+" are shopped having bill amount:: "+billAMt+" => "+msg;
	}

}
