package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        logger.trace("We've just generayted user!");
        logger.debug("We've just generayted user!");
        logger.info("We've just generayted user!");
        logger.warn("We've just generayted user!");
        logger.error("We've just generayted user!");
        logger.fatal("We've just generayted user!");

    }

}
