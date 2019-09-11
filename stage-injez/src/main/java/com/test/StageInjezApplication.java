package com.test;

//import org.jboss.jandex.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


//@Configuration
//@EnableAutoConfiguration
@SpringBootApplication
public class StageInjezApplication {
	  //protected SpringApplicationBuilder configure (SpringApplicationBuilder builder) {
	     // return builder.sources(Main.class);
	  //}
	public static void main(String[] args) {
		SpringApplication.run(StageInjezApplication.class, args);
	}

}
