import org.slf4j.*;

public class GeneralSystem {
	
	//create a logger
	private static final Logger log = LoggerFactory.getLogger(GeneralSystem.class);
	
	
	public static void main (String [] args) {
		

		log.info("the class {} is started", GeneralSystem.class);
		log.error("В программе возникла ошибка!");
		
		StartLogic.startLogic();
		Console console = new Console ();
		Thread threadConsole = new Thread(console);
		threadConsole.start();
	}
	

}
