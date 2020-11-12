package exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WrongCageSizeException extends Throwable {

    private static Logger logger = LoggerFactory.getLogger(WrongCageSizeException.class);

    public WrongCageSizeException(){
        super("Неподходящий размер клетки для этого животного");
        logger.error("Неподходящий размер клетки для этого животного");
    }
}
