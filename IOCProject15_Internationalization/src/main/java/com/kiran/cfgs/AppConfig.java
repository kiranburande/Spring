package com.kiran.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig 
{
	@Bean(name="messagesource")
	public ResourceBundleMessageSource createRBMS()
	{
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasename("com/kiran/commons/App");
		return source;
	}
}
