package com.tutorialworks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyApplication {

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();
        logger.info("Henlo, world!");
    }
}
