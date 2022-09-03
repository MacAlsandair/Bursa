package com.macalsandair;

import org.springframework.stereotype.Component;

import com.macalsandair.models.Town;

//@Component
public class State {
	Town capital;
	
	State (Town capital) {
		this.capital = capital;
	}

	//@Override
	public String toString() {
		return "State [capital=" + capital + "]";
	}
	
	
}
