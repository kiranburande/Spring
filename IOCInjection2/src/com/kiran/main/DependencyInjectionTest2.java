package com.kiran.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.kiran.sbeans.WishMessageGenerator;

public class DependencyInjectionTest2 
{
	public static void main(String[] args) 
	{
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/kiran/cfgs/ApplicationContext.xml");
		Object obj = ctx.getBean("wmg");
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		String season = generator.showSeason();
		System.out.println("Its "+season+" season");
		ctx.close();
	}

}
