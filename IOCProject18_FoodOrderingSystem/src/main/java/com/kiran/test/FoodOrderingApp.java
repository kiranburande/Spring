package com.kiran.test;

import java.io.InputStream;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kiran.cfgs.AppConfig;
import com.kiran.service.FoodService;

/**
 * Hello world!
 */
public class FoodOrderingApp 
{
    public static void main(String[] args) 
    {
    	
    	 InputStream stream = FoodOrderingApp.class.getClassLoader()
    		        .getResourceAsStream("com/kiran/commons/food.properties");
    		    System.out.println(stream != null ? "File FOUND ✅" : "File NOT found ❌");
    	
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        FoodService service = ctx.getBean("foodService",FoodService.class);
        service.displayFoodInfo();
        ctx.close();
    }
}
