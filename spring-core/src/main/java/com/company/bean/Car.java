package com.company.bean;

import org.springframework.stereotype.Component;

@Component
public class Car implements  Vehicle {

	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Car is running");
		
	}

}
