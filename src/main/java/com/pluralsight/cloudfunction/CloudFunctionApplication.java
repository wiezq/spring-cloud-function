package com.pluralsight.cloudfunction;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//entry point for JAR org.springframework.cloud.function.adapter.gcp.GcfJarLauncher

@SpringBootApplication
public class CloudFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudFunctionApplication.class, args);
	}

	@Bean
	public Function<String, String> function() {
		return value -> "Greetings, Pluralsight and cloud user " + value;
	}

}
