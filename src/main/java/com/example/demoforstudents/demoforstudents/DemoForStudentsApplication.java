package com.example.demoforstudents.demoforstudents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.simpledemo.git")
@SpringBootApplication
public class DemoForStudentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoForStudentsApplication.class, args);
	}

}
