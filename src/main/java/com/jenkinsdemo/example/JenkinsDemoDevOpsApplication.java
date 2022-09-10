package com.jenkinsdemo.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JenkinsDemoDevOpsApplication extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JenkinsDemoDevOpsApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoDevOpsApplication.class, args);
	}
	
	@RequestMapping(value="/hello")
	public String welcome() {
		return "Hello, This is Jigar Rathod";
	}
}
