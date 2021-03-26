package com.christian.springAnnotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	
	//Setter Injection Example
	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "SHOOT THE J";
	}

	@Override
	public String getDailyFortune() {
		return ("HES GOING FOR 50 "+fortuneService.getFortune());
	}

}
