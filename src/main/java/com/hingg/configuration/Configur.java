package com.hingg.configuration;
//without configuration you can not declare bean class

//if you want to create directly object so you can used the component annotation

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configur {
	
	@Bean
	public productservice productservice()
	{
		return new productservice();
		
		
	}

}
