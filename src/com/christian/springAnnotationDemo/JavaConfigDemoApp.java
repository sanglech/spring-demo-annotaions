package com.christian.springAnnotationDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//Read spring config java class
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext (SportConfig.class);
		
		//get bean from spring container
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		
		//Call bean methods
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		
		
		//close the context
		
		context.close();

	}

}
