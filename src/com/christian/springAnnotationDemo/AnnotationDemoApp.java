package com.christian.springAnnotationDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//Read spring config file
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext ("applicationContext.xml");
		
		//get bean from spring container
		// Note because using coach class, only classes DEFINED IN THERE CAN BE CALLED
		Coach tCoach= context.getBean("tennisCoach",Coach.class);
		BasketBallCoach bballCoach= context.getBean("basketBallCoach",BasketBallCoach.class);
		Coach curlCoach= context.getBean("curlingCoach",Coach.class);
		Coach balletCoach= context.getBean("balletCoach",Coach.class);
		
		
		//BasketballCoach - Setter Injection
		//BalletCoach - Field Injection
		//Tennis Coach - Constructor Injection
		
		
		//call a method on the bean
				
		System.out.println(tCoach.getDailyWorkout());
		System.out.println(bballCoach.getDailyWorkout());
		
		System.out.println(tCoach.getDailyFortune());
		System.out.println(bballCoach.getDailyFortune());
		
		System.out.println(bballCoach.getFortuneService().getFortune());
		
		
		System.out.println(curlCoach.getDailyWorkout());
		System.out.println(curlCoach.getDailyFortune());
		
		
		System.out.println(balletCoach.getDailyWorkout());
		System.out.println(balletCoach.getDailyFortune());
		
		
		
		//close the context
		
		context.close();

	}

}
