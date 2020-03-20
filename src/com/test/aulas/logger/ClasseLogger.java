package com.test.aulas.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ClasseLogger {
	private final static Logger LOGGER = Logger.getLogger(ClasseLogger.class .getName());
	
	
	public static void main(String[] args) {
		LOGGER.setLevel(Level.INFO);
		LOGGER.info("Hello");
		LOGGER.warning("Hello");
	}
}
