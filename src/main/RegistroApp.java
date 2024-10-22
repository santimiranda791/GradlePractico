import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RegistroApp {
    // Crear un logger
    private static final Logger logger = LogManager.getLogger(RegistroApp.class);

    public static void main(String[] args) {
        logger.trace("Este es un mensaje TRACE");
        logger.debug("Este es un mensaje DEBUG");
        logger.info("Este es un mensaje INFO");
        logger.warn("Este es un mensaje WARN");
        logger.error("Este es un mensaje ERROR");
        logger.fatal("Este es un mensaje FATAL");
    }
}
