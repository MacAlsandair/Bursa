
import java.util.Scanner;

public class Console implements Runnable {

	Console () {
		
	}
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter y for one addition turn, or t for timer, or ts");
		
		while (1 == 1) {
			String i = sc.nextLine();
			if (i.equals("y")) {
				System.out.println("New turn");
				TurnSystem.nextTurn();
			}
			else if (i.equals("t")) {
				System.out.println("Please, write an interval");
				try {
					int j = sc.nextInt();
					TimerForTurn.startATimer(j);
				}
				catch (IllegalArgumentException ex) {
					System.out.println("i!=int");
				}
			}
			else if (i.equals("ts")) {
				TimerForTurn.stopATimer();
			}
			else {
				System.out.println("Please, enter y for one addition turn");
			}
		}
		
		
		
		
	}
}
