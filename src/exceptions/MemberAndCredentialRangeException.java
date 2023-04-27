package exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MemberAndCredentialRangeException extends Exception {
    private static final Logger LOGGER = LogManager.getLogger(MemberAndCredentialRangeException.class);

    public MemberAndCredentialRangeException(String message) {
        LOGGER.info(message);
    }
}
