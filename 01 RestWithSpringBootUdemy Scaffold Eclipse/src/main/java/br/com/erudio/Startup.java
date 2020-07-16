package br.com.erudio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Startup {// to initiate spring boot application
	
	public static void main(String[] args) {
		
		//it initiates the whole spring framework
		//hence written under main function		
		SpringApplication.run(Startup.class, args); 
	}

}
