package com.fab.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationApplication.class, args);
	}

}
