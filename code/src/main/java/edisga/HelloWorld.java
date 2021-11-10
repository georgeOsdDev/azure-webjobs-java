package edisga;
import java.time.LocalDateTime;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {

	private static Logger logger = LogManager.getLogger(HelloWorld.class);
	public static void main(String[] args) {
		logger.error("Error!!");
		logger.info("Info!!");
		logger.trace("Trace!!");
		logger.trace("------------------------------------------------------------");
		logger.trace("Hello World from WebJob: " + LocalDateTime.now());
		logger.trace("------------------------------------------------------------");
		logger.trace("Prints JVM memory utilization statistics");
		logger.trace("------------------------------------------------------------");
		int mb = 1024*1024;
		//Getting the runtime reference from system
		Runtime runtime = Runtime.getRuntime();
		logger.trace("##### Heap utilization statistics [MB] #####");
		//Print used memory
		logger.trace("Used Memory:" + (runtime.totalMemory() - runtime.freeMemory()) / mb);
		//Print free memory
		logger.trace("Free Memory:" + runtime.freeMemory() / mb);
		//Print total available memory
		logger.trace("Total Memory:" + runtime.totalMemory() / mb);
		//Print Maximum available memory
		logger.trace("Max Memory:" + runtime.maxMemory() / mb);


		Map<String, String> environmentVariables = System.getenv();
		for(Map.Entry<String, String> entry : environmentVariables.entrySet()) {
				logger.trace("Env: " + entry.getKey() + " = " + entry.getValue());
		}
	}
}
