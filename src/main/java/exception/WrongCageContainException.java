package exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WrongCageContainException extends Throwable {

    private static Logger logger = LoggerFactory.getLogger(WrongCageContainException.class);

    public WrongCageContainException(){
        super("Это животное отсутствует");
        logger.warn("Это животное отсутствует");
    }
}
