package com.example.demo;

import com.example.demo.domain.Dogs;
import com.example.demo.service.DogService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(DogService dogService) {
		return args -> {
			// read json and write to db
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Dogs>> typeReference = new TypeReference<List<Dogs>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("target/classes/data.json");
			try {
				List<Dogs> dogs = mapper.readValue(inputStream,typeReference);
				dogService.save(dogs);
				System.out.println("Dogs Saved!");
			} catch (IOException e){
				System.out.println("Unable to save dogs: " + e.getMessage());
			}
		};
	}

}
