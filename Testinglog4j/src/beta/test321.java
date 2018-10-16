package beta;

import org.apache.logging.log4j.*;

public class test321 {
	private static Logger log=LogManager.getLogger(test321.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.info("Hello this is Log file");
		log.debug("THis is debug file");
		log.error("THis is error file");
		log.fatal("THis is fatal error");
		
	}

}
