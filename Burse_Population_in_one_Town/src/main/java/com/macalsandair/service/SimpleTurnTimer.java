package com.macalsandair.service;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import org.springframework.stereotype.Service;

@Service
public class SimpleTurnTimer implements TurnTimer {
	Timer timer;
	TurnSystem turnSystem;
	
	public SimpleTurnTimer (TurnSystem turnSystem) {
		this.turnSystem = turnSystem;
	}
	
	
	
	
	@Override
	public void startATimer (int interval) {
		if (timer == null) {
			timer = new Timer (interval, new ActionListener() {
				public void actionPerformed (ActionEvent e) {
					turnSystem.commonTurn();
				}
			});
			timer.start();
		}
		else {
			timer.start();
		}

	}
	@Override
	public void stopATimer () {
		timer.stop();

	}
	@Override
	public void removeATimer () {
		timer = null;
	}




	public TurnSystem getTurn() {
		return turnSystem;
	}

	


}

