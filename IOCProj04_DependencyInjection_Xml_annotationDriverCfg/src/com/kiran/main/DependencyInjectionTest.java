package com.kiran.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.kiran.sbeans.WeekDayFinder;

public class DependencyInjectionTest 
{
	public static void main(String[] args) 
	{
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/kiran/cfgs/applicationContext.xml");
		Object obj = ctx.getBean("wdf");
		WeekDayFinder wdf = (WeekDayFinder)obj;
		try {
			String msg = wdf.showDayOfWeek("Raja");
			System.out.println("Season Name :"+msg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		ctx.close();
	}
}
