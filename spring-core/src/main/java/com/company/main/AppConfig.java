package com.company.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.company.bean.Bike;
import com.company.bean.Tyre;

@Configuration
public class AppConfig {
	
	@Bean
	public Bike getbike() {
		return new Bike();
		
	}
	
	@Bean
	public Tyre gettyre() {
		return new Tyre();
	}
	
	
	

}
