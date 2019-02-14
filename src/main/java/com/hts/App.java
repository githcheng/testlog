package com.hts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {

    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ){
//        BasicConfigurator.configure();
        System.out.println( "Hello World!" );
        logger.error("error");logger.info("info");
        logger.error("error2");
        logger.error("error3");
    }
}
