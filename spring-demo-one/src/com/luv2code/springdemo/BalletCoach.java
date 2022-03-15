package com.luv2code.springdemo;

public class BalletCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BalletCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Do spins for 40 minutes";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
