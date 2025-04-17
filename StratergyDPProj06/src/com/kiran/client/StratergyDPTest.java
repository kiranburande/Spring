package com.kiran.client;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kiran.config.AppConfig;
import com.kiran.sbeans.Flipkart;

public class StratergyDPTest
{
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Flipkart fpkt = ctx.getBean("fpkt",Flipkart.class);
		String resultMsg  = fpkt.shopping(new String[] {"Shirt","Trouser"}, new double[] {1000.0,3000.40});
		System.out.println(resultMsg);
		ctx.close();
	}
}