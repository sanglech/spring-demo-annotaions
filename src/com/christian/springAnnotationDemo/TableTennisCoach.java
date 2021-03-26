package com.christian.springAnnotationDemo;


public class TableTennisCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	public TableTennisCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "HIT DA BALL";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
