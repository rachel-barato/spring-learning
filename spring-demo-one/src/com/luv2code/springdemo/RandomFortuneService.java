package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] fortunes = {"You'll have a great day!", "This is your lucky day!", "Embrace your disavantages!"};

	@Override
	public String getFortune() {
		
		return this.fortunes[new Random().nextInt(this.fortunes.length)];
	}
}
