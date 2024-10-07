package com.sachet.PipelineProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PipelineProjectApplication {

	public static void main(String[] args) {
		System.out.println("The project has started");
		for (int i=0; i<10; i++) {
			System.out.println("Printing the project start "+(i+1));
		}
//		SpringApplication.run(PipelineProjectApplication.class, args);
	}

}
