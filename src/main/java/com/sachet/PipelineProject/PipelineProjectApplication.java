package com.sachet.PipelineProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class PipelineProjectApplication {

	public static void main(String[] args) {
		System.out.println("The project has started");
		for (int i=0; i<50; i++) {
			System.out.println("Printing the project start "+(i+1));
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				System.out.println("Exception occured while sleeping");
			}
		}
//		SpringApplication.run(PipelineProjectApplication.class, args);
	}

}
