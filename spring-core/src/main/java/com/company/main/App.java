package com.company.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.bean.Bike;
import com.company.bean.Tyre;
import com.company.bean.Vehicle;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Bike obj =  (Bike) context.getBean("bike");
		
		Tyre t=(Tyre) context.getBean("tyre");
		t.setName("mrf");
		
		obj.setT(t);
	       obj.drive();
	}

}
