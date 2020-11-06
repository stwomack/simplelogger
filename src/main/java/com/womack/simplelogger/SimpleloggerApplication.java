package com.womack.simplelogger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class SimpleloggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleloggerApplication.class, args);
	}

	@Bean
	CommandLineRunner dummyCLR() {
		return args -> {
			int count = 1;
			while (true) {
				Thread.sleep(1000);
				System.out.println("Printing SYSOUT: " + new Date());
				System.err.println("Printing SYSERR: " + count);
				count++;
			}
		};
	}
}
