package exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SalaryRangeException extends Exception {
    private static final Logger LOGGER = LogManager.getLogger(SalaryRangeException.class);

    public SalaryRangeException(String message) {
        LOGGER.info(message);
    }
}
