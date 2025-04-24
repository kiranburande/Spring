package com.kiran.config;

import java.time.LocalDate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.kiran")
public class AppConfig {

	@Bean(name="dt")
	@Scope("singleton")
	public LocalDate createDate()
	{
		System.out.println("AppConfig.createDate()");
		return LocalDate.now();
	}
	
	
	@Bean(name="dt1")
	@Scope("singleton")
	public LocalDate createDate1()
	{
		System.out.println("AppConfig.createDate1()");
		return LocalDate.now();
	}

}
