package com.christian.springAnnotationDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//Constructor injection Example
	@Autowired
	
	public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice your serve";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	
	//Define init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> In Tennis coach do startupstuff");
		
	}
	
	
	//Define cleanup method
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println(">> In Tennis coach do CleanUpstuff");
		
	}

}
