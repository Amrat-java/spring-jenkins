package com.jenkins.springjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {


	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application started.....");
	}
	public static void main(String[] args) {
		logger.info("Application executed.....");
		logger.info("Application executed 2nd time.....");
		logger.info("Application executed 3rd time Again.....");


		SpringApplication.run(SpringJenkinsApplication.class, args);

	}

}
