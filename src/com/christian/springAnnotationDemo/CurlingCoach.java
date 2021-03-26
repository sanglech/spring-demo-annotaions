package com.christian.springAnnotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CurlingCoach implements Coach {
	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		return "SWEEEEEPPPP";
	}
	
	@Autowired
	@Qualifier("happyFortuneService")
	public void doSomething(FortuneService _fortuneService) {
		System.out.println(">> CurlCoach: In doSomething func");
		this.fortuneService=_fortuneService;
	}

	@Override
	public String getDailyFortune() {
		return "TURN UP, this guy is crazy "+fortuneService.getFortune();
	}

}
