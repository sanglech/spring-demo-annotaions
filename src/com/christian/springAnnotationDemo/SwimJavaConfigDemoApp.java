package com.christian.springAnnotationDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//Read spring config java class
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext (SportConfig.class);
		
		//get bean from spring container
		
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		
		TableTennisCoach ttCoach=context.getBean("tableTennisCoach",TableTennisCoach.class);
		
		
		//Call bean methods
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println("Email: "+ theCoach.getEmail());
		System.out.println("Team: "+ theCoach.getTeam());
		
		
		System.out.println(ttCoach.getDailyWorkout());
		System.out.println(ttCoach.getDailyFortune());
		
		
		
		//close the context
		
		context.close();

	}

}
