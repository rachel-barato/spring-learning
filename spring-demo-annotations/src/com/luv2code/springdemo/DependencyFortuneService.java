package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DependencyFortuneService implements FortuneService {
	
	/* Your fortune service should read the fortunes from a file.   
	 * The fortune service should load the fortunes into an array 
	 * When the getFortune() method is called it would return a random fortune from the array. */
	
	@Value("${dailyFortunes}")
	private String[] dailyFortunes;
	
	private Random randomID = new Random();
	
	@Override
	public String getFortune() {
		return dailyFortunes[randomID.nextInt(dailyFortunes.length)];
	}

}
