import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GeneralSystem {
	
	//create a logger
	public static final Logger LOGGER = LoggerFactory.getLogger(GeneralSystem.class);
	
	
	public static void main (String [] args) {
		
	    LOGGER.info("Test log record!!!");
	    LOGGER.error("В программе возникла ошибка!");
		
		StartLogic.startLogic();
		Console console = new Console ();
		Thread threadConsole = new Thread(console);
		threadConsole.start();
	}
	

}
