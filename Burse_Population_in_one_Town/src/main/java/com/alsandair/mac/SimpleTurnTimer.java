package com.alsandair.mac;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleTurnTimer implements TurnTimer {
	Timer timer;
	Turn turn;
	
	public SimpleTurnTimer (Turn turn) {
		this.turn = turn;
	}
	
	
	
	
	@Override
	public void startATimer (int interval) {
		if (timer == null) {
			timer = new Timer (interval, new ActionListener() {
				public void actionPerformed (ActionEvent e) {
					turn.nextTurn();
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




	public Turn getTurn() {
		return turn;
	}

	


}

