package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune() + "\n");
		
		Coach yogaCoach = context.getBean("yogaCoach", Coach.class);
		
		System.out.println(yogaCoach.getDailyWorkout());
		System.out.println(yogaCoach.getDailyFortune() + "\n");
		
		Coach runnerCoach = context.getBean("runnerCoach", Coach.class);
		
		System.out.println(runnerCoach.getDailyWorkout());
		System.out.println(runnerCoach.getDailyFortune());
		
		context.close();

	}

}
