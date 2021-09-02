package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication is a convenience annotation that adds the following:
// @Configuration
// @EnableAutoConfiguration - tells Spring to start adding beans based on classpath settings,
// other beans, and various property settings.  i.e. if spring-webmvc is on classpath,
// this annotation flags the app as a web app and activates key behaviors, such as setting up DispatcherServlet
// @ComponentScan - tells Spring to look for other components, configuration, and services in
// com/example package
@SpringBootApplication
public class RestServiceApplication {

	// No XML (i.e. web.xml).  This web app is 100% Java
	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

}
