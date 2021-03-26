package com.christian.springAnnotationDemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	@Value("${swimEmail}")
	private String email;
	
	@Value("${swimTeam}")
	private String team;
	
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public SwimCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "SWIM YOU FOOLS";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
