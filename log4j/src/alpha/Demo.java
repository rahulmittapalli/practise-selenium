package alpha;
import org.apache.logging.log4j.*;

public class Demo {
		
	private static Logger log=LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("I am debugger");
		log.info("Object is present");
		log.error("Object is not present");
		log.fatal("THis is fatal messgae ");
		}
	}  
 