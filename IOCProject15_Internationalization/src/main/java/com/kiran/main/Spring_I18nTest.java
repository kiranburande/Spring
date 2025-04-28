package com.kiran.main;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kiran.cfgs.AppConfig;

public class Spring_I18nTest 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Language Code");
		String language = sc.nextLine();
		System.out.println("Enter Country Code");
		String country = sc.nextLine();
		Locale locale = new Locale(language,country);
		//Locale locale = Locale.of(language, country);
		String msg1 =  ctx.getMessage("welcome.msg",new Object[]{"kiran"},locale);
		String msg2 =  ctx.getMessage("goodbye.msg",new Object[]{},locale);
		String msg3 =  ctx.getMessage("application.title",new Object[]{},locale);
		String msg4 =  ctx.getMessage("wish.msg",new Object[] {},locale);
		
		System.out.println(msg1+"        "+msg2+"      "+msg3+"      "+msg4);
		
		ctx.close();
	}
}
