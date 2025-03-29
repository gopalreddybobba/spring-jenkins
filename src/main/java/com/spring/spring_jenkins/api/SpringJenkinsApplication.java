package com.spring.spring_jenkins.api;


import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	public static Logger logger= LoggerFactory.getLogger(SpringJenkinsApplication.class);
	@PostConstruct
	public void intt(){
		logger.info("Spring Boot Jenkins Application Started......");
	}
	public static void main(String[] args) {
		logger.info("Application Executed......");

		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
