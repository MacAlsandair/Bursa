import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class TimerForTurn {
	static Timer timer;
	
	
	
	public static void startATimer (int interval) {
		if (timer == null) {
			timer = new Timer (interval, new ActionListener() {
				public void actionPerformed (ActionEvent e) {
					TurnSystem.nextTurn();
				}
			});
			timer.start();
		}
		else {
			timer.start();
		}

	}
	public static void stopATimer () {
		timer.stop();

	}
	public static void removeATimer () {
		timer = null;
	}



}

