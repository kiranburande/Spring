package com.kiran.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kiran.cfgs.AppConfig;
import com.kiran.service.PlayerService;

/**
 * Hello world!
 */
public class PlayerApp {
    public static void main(String[] args)
    {
    	 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	 PlayerService service = ctx.getBean("playerService",PlayerService.class);
       // System.out.println("Hello World!");
    	 service.displayPlayerInfo();
    	 ctx.close();
    }
}
