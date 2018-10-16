package beta;
import org.apache.logging.log4j.*;

public class Demo2 {
	
private static Logger log=	LogManager.getLogger(Demo2.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("I am debugger");
		log.error("I am error");
		log.info("I am info");
		log.fatal("I am fatal");
	}

}
