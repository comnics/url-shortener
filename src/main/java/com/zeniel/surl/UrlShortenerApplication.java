package com.zeniel.surl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UrlShortenerApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(UrlShortenerApplication.class);
	
    @Value("${app.name}")
    private String applicationName;
    
	public static void main(String[] args) {
		SpringApplication.run(UrlShortenerApplication.class, args);	
	}
	
	@Bean
	public CommandLineRunner runner() {
	    return (a) -> {
	    	LOGGER.info("############# Application Name: " + applicationName + "#############");
	    };
	};

}
