package com.christian.springAnnotationDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//Read spring config file
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext ("applicationContext.xml");
		
		//get bean from spring container
		Coach theCoach= context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach= context.getBean("tennisCoach",Coach.class);
		
		//Check if they are the same
		
		System.out.println(theCoach==alphaCoach? "They are the same " + theCoach: "They are not the same " + alphaCoach +" "+"alphaCoach");
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
