package com.example.demo;
import org.springframework.boot.commandLineRunner;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.*;
@SpringBootApplication
public class DemoApplication implement CommandLineRunner {
	public static final Logger Logger=LoggerFactory.getLogger(DemoApplication.class,args);

	public static void main(String[] args) {
		Logger.info("its a CI pipeline Job");
		SpringApplication.run(DemoApplication.class, args);
	}
	
	public void run(String...args) throws Exception{
		Logger.info("second log");
		
	}

}
