package com.kiran.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.kiran.sbeans.WishMessageGenerator;

public class DependencyInjectionTest 
{
	public static void main(String[] args) 
	{
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/kiran/cfgs/applicationContext.xml");
		
		Object obj = ctx.getBean("wmg");
	
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		
		String msg=generator.showWishMessage("Raj");
		System.out.println("result :"+msg);
		
		
		
		// close the IOC Container
		ctx.close();
	}

}
