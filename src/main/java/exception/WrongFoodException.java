package exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WrongFoodException extends Throwable {

    private static Logger logger = LoggerFactory.getLogger(WrongFoodException.class);

    public WrongFoodException(){
        super("Неподходящая еда для данного типа животного");
        logger.warn("Неподходящая еда для данного типа животного");
    }

}
