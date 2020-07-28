package com.company.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.bean.Bike;
import com.company.bean.Tyre;
import com.company.bean.Vehicle;

public class App {

	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		Bike obj =  (Bike) context.getBean(Bike.class);
		
		Tyre t=(Tyre) context.getBean(Tyre.class);
		t.setName("mrf");
		
		obj.setT(t);
	       obj.drive();
	}

}
