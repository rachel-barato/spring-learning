package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] fortunes = {
			"The journey is the reward!",
			"Your disavantage is your greatest advantage!",
			"Dilligence is the mother of good luck!"
	};
	
	private Random randomID = new Random();
	
	@Override
	public String getFortune() {
		return fortunes[randomID.nextInt(fortunes.length)];
	}

}
