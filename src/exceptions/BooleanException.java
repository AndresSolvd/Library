package exceptions;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BooleanException extends Exception {

    private static final Logger LOGGER = LogManager.getLogger(BooleanException.class);
    public BooleanException(String message){
        LOGGER.info(message);
    }
}
