package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {

	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	public PingPongCoach() {
		System.out.println(">> Ping Pong Coach constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice a good racket swing";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
