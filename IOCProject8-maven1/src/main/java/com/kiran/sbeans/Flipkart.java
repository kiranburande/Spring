package com.kiran.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public class Flipkart 
{
	@Autowired
	@Qualifier("dtdc")
	private ICourior courior;
	
	public String shopping(String []items,double []prices)
	{
		double bilAmt=0.0;
		for(double d:prices)
		{
			bilAmt += d;
		}
		int oid = new Random().nextInt(100000);
		String msg =courior.deliver(oid);
		return Arrays.toString(items)+" items with bill Amount ::"+bilAmt+"---"+msg;  
	}
}
