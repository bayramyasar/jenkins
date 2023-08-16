package com.dyippay.dofjenkins;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
@Slf4j
public class DofJenkinsApplication {

	public static void main(String[] args) {
		String port = "8085";
		log.debug("Service Port: {}", port);

		SpringApplication application = new SpringApplication(DofJenkinsApplication.class);

		// to get properties programmatically
		Properties properties = new Properties();
		properties.put("server.port", port);

		application.setDefaultProperties(properties);

		application.run(args);

		//SpringApplication.run(DofJenkinsApplication.class, args);
	}

}
