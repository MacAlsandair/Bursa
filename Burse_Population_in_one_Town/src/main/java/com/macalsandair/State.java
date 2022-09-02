package com.macalsandair;

import org.springframework.stereotype.Component;

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
