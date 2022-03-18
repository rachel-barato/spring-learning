package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TennisJavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune() + "\n");
		
		context.close();

	}

}
