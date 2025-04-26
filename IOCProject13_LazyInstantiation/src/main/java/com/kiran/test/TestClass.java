package com.kiran.test;

import java.time.LocalDate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kiran.config.AppConfig;
import com.kiran.sbeans.WishMessageGenerator;

public class TestClass 
{
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		WishMessageGenerator wmg1 = ctx.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator wmg2 = ctx.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator wmg3 = ctx.getBean("wmg",WishMessageGenerator.class);
		 System.out.println(wmg1.hashCode()+"  "+wmg2.hashCode()+"   "+wmg3.hashCode());
		 
		 System.out.println("============================================");
		 
		 LocalDate dt1 = ctx.getBean("dt", LocalDate.class);
		 LocalDate dt2 = ctx.getBean("dt", LocalDate.class);
		 System.out.println(dt1.hashCode()+"   "+dt2.hashCode());
		 System.out.println("=============================================");
		 
		 LocalDate dt3 = ctx.getBean("dt1", LocalDate.class);
		 LocalDate dt4 = ctx.getBean("dt1", LocalDate.class);
		 System.out.println(dt3.hashCode()+"   "+dt4.hashCode());
		 
		 ctx.close();
	}

}
