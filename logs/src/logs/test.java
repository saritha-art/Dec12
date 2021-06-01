package logs;
import org.apache.logging.log4j.*;

public class test {
	private static Logger log = LogManager.getLogger(test.class.getName());
	public static void main (String[]args) {
		log.debug("I am debugging");
		log.error("I am error");
		log.fatal("I am fatal");
		log.info("I am info");
		log.error("I am error3");
		log.trace("I am trace");
	}

}
