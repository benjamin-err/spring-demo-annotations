package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
 * Spring automatically registers this bean and adds "tennisCoach1"
 * as the id. Default bean id is lowercase class name, i.e. "tennisCoach"
 * */

/*
 * Spring scans for a component that implements FortuneService interface
 * and it will find HappyFortuneService component that meets the requirement.
 * This component will then be autowired into fortuneService
 * */
@Component("tennisCoach1")
public class TennisCoach implements Coach {

	// field level injection
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

	/*
	 * @Autowired // not necessary if only one constructor available public
	 * TennisCoach(FortuneService fortuneService) { this.fortuneService =
	 * fortuneService; }
	 */

	public TennisCoach() {
		System.out.println(">> Tennis Coach constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	// setter or method injection
	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * System.out.println("setter method"); this.fortuneService = fortuneService; }
	 */

	/*
	 * @Autowired public void doStuff(FortuneService fortuneService) {
	 * System.out.println("setter method"); this.fortuneService = fortuneService; }
	 */
}
