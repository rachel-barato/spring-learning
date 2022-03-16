package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class YogaCoach implements Coach {
	
	private FortuneService fortuneService;

	//Setter Injection
	@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do the warrior pose for 5 breaths";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
