package exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WrongKillAnimalException extends Throwable {

    private static Logger logger = LoggerFactory.getLogger(WrongKillAnimalException.class);

    public WrongKillAnimalException(){
        super("животное мертво");
        logger.error("животное мертво");
    }
}
