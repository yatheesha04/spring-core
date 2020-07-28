package com.company.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Bike implements Vehicle {
	
	
    @Autowired
	Tyre t;
    
    




	@Override
	public String toString() {
		return "Bike [t=" + t + "]";
	}



	public Tyre getT() {
		return t;
	}



	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Bike(Tyre t) {
		super();
		this.t = t;
	}



	public void setT(Tyre t) {
		this.t = t;
	}



	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Bike is running"+ t);
		
	}

}
