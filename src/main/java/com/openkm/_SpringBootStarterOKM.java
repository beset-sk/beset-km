package com.openkm;

import org.jadice.gwt.spring.autoconfig.EnableGWTSpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
@EnableGWTSpringBootApplication("com.openkm.frontend.Main")
@ServletComponentScan
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class _SpringBootStarterOKM extends SpringBootServletInitializer {

	public static void main(final String[] args) {
		SpringApplication.run(_SpringBootStarterOKM.class, args);
	}
}
