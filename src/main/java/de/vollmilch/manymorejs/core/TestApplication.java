package de.vollmilch.manymorejs.core;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class TestApplication {

	/** logger */
	final static Logger fLog = LoggerFactory.getLogger(TestApplication.class);

	public static void main(String[] args) {
		fLog.info("Starting UP");
		SpringApplication.run(TestApplication.class, args);
		generateRandomUIDs();
	}

	/**
	 * Generates random UIDs
	 * 
	 * @return UID
	 */
	public static String generateRandomUIDs() {
		return UUID.randomUUID().toString();
	}
}
