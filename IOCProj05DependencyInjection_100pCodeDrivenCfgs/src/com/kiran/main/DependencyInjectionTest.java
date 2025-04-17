package com.kiran.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kiran.config.AppConfig;
import com.kiran.sbeans.WeekDayFinder;

public class DependencyInjectionTest 
{
	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main()(start)");
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		WeekDayFinder finder = (WeekDayFinder)ctx.getBean("wdf");
		
		String msg = finder.showMessageOnDayOfTheWeek("Raja");
		System.out.println(msg);
		
		ctx.close();
		System.out.println("DependencyInjectionTest.main()(end)");
	}
}
