package com.macalsandair;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


//It is a rudiment class, which conflicts with Spring boot< which has its own Application contex configuration
//@Configuration
//@ComponentScan
public class MyApplicationContextConfiguration {

//	@Bean
//	@Scope("singleton")
//	public Town town() {
//		return new Town();
//	}
//	
//	@Bean 
//	@Scope("singleton")
//	public Console console(Turn turn, TurnTimer turnTimer) {
//		return new Console(turn, turnTimer);
//	}
//	
//	@Bean
//	@Scope("singleton")
//	public Turn turn (Town town, BirthRateTurn birthRateTurn) {
//		return new TurnSystem(town, birthRateTurn);
//	}
//	
//	@Bean
//	public SimpleTurnTimer simpleTurnTimer(Turn turn) {
//		return new SimpleTurnTimer(turn);
//	}
	
}
