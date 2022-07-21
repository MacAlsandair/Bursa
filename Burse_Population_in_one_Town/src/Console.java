
import java.util.Scanner;

public class Console implements Runnable {

	Console () {
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter y for one addition turn, or t for timer, or ts");
		
//		while (1 == 1) {
//			String i = sc.nextLine();
//			if (i.equals("y")) {
//				System.out.println("New turn");
//				TurnSystem.nextTurn();
//			}
//			else if (i.equals("t")) {
//				System.out.println("Please, write an interval");
//				try {
//					int j = sc.nextInt();
//					TimerForTurn.startATimer(j);
//				}
//				catch (IllegalArgumentException ex) {
//					System.out.println("i!=int");
//				}
//			}
//			else if (i.equals("ts")) {
//				TimerForTurn.stopATimer();
//			}
//			else {
//				System.out.println("Please, enter y for one addition turn");
//			}
//		}
		while (1 == 1){
			String i = sc.nextLine();
			switch (i) {
			case "y":
				System.out.println("New turn");
				TurnSystem.nextTurn();
				break;
			case "t":
				System.out.println("Please, write an interval");
				int interval = sc.nextInt();
				TimerForTurn.startATimer(interval);
				break;
			case "ts":
				TimerForTurn.stopATimer();
				break;
			case "newCard":
				this.newPopCardCommand(sc);
				break;
			default:
				break;
			}
		}
				
	}
	
	public static void printPopulation (PullOfTown burseTown) {
		for (int i = 0; i<burseTown.PopCardPull.size(); i++) {
			System.out.println(burseTown.PopCardPull.get(i).population);
		}
	}
	
	public void newPopCardCommand (Scanner sc) {
		System.out.println("Please, enter an ammount of PopCard");
		int ammount = sc.nextInt();
		//System.out.println(ammount);
		System.out.println("Please, enter a class of PopCard");
		//PopCard popCard = PopCardBuilder.createPopCard(ammount, SocialClass.returnSocialClass(sc.nextLine()));
		PopCard popCard = PopCardBuilder.createPopCard(ammount, SocialClass.MIDDLE);
		System.out.println(popCard.toString());
		
	}

}
