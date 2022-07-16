
public class GeneralSystem {
	public static void main (String [] args) {
		PopCard popCard = new PopCard(100);
		TurnSystem.setterpopCard(popCard);
		Console console = new Console ();
		Thread threadConsole = new Thread(console);
		threadConsole.start();
	}
}
