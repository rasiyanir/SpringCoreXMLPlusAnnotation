package com.riyaz.demospringcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		/*
		 * Vehicle vehicle = (Vehicle) context.getBean("bike"); vehicle.drive();
		 */
		
		
		/*
		 * Tyre t = (Tyre) context.getBean("tyre"); System.out.println(t);
		 */
		
		Car car = (Car) context.getBean("car");
		car.drive();
		
		
	}
}
