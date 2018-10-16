package alpha;

import org.apache.logging.log4j.*;
public class general {
private static Logger log=LogManager.getLogger(general.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("I am debugging");
		log.info("information");
		log.error("Error ");
		
		log.fatal("Fatal");
			
	}

}
