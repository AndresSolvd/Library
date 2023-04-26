package exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class YearRangeException extends Exception {
    private static final Logger LOGGER = LogManager.getLogger(YearRangeException.class);

    public YearRangeException(String message) {
        LOGGER.info(message);
    }
}
