package exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IdRangeException extends Exception {
    private static final Logger LOGGER = LogManager.getLogger(IdRangeException.class);

    public IdRangeException(String message) {
        LOGGER.info(message);
    }
}