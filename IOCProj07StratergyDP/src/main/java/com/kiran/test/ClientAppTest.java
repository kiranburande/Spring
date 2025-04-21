package com.kiran.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kiran.config.AppConfig;
import com.kiran.sbeans.Flipkart;

public class ClientAppTest 
{
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Flipkart fpkt = ctx.getBean("fpkt",Flipkart.class);
		String resultMsg = fpkt.shopping(new String[]{"Shirt","Pant"}, new double[]{800.0,900.80});
		System.out.println(resultMsg);
		ctx.close();
	}
}