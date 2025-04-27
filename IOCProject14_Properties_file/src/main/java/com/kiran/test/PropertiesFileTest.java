package com.kiran.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.kiran.config.AppConfig;
import com.kiran.sbeans.PersonInfo;

public class PropertiesFileTest 
{
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		PersonInfo pinfo = ctx.getBean("pinfo",PersonInfo.class);
		System.out.println(pinfo);
		ctx.close();
	}
}
