package com.kiran.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.kiran.sbeans.SeasonFinder;

public class DependencyInjectionTest 
{
	public static void main(String[] args) 
	{
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/kiran/cfgs/applicationContext.xml");
		Object obj = ctx.getBean("sf");
		SeasonFinder sf  = (SeasonFinder)obj;
		try {
			String msg = sf.showSeasonName();
			System.out.println("Season Name :"+msg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		ctx.close();
	}
}
