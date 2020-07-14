package com.summerSchool.firstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.summerSchool"})
@EnableAutoConfiguration
public class MyfirstprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstprojectApplication.class, args);
	}

}
