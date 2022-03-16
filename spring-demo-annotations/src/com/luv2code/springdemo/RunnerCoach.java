package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RunnerCoach implements Coach {
	
	//field Injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Run for 1 km today.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
