package com.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean from spring container
		Coach tennisCoach = context.getBean("tennisCoach1", Coach.class);
		Coach pingPongCoach = context.getBean("pingPongCoach", Coach.class);
		
		// do stuff on the bean
		System.out.println("-- Tennis Coach --");
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());
		
		System.out.println("-- Ping Pong Coach --");
		System.out.println(pingPongCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
