
public class GeneralSystem {
	public static void main (String [] args) {
		
		StartLogic.startLogic();
		Console console = new Console ();
		Thread threadConsole = new Thread(console);
		threadConsole.start();
	}
	

}
