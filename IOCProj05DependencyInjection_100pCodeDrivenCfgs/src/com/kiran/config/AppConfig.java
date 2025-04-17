package com.kiran.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.kiran.sbeans")
public class AppConfig 
{

	public AppConfig() {
		System.out.println("AppConfig::0-arg-Constructors");
	}
	
	@Bean(name="ldate")
	public LocalDate createLDate()
	{
		System.out.println("AppConfig.createDate()");
		return LocalDate.now();
	}
}
