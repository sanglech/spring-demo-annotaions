package com.christian.springAnnotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BalletCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public BalletCoach() {
		System.out.println("BalletCoach: >> IN default constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "SPIN";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
