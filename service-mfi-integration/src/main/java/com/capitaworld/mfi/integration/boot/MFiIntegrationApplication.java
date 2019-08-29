package com.capitaworld.mfi.integration.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@ComponentScan(basePackages = { "com.capitaworld.mfi.integration" })
@EnableAsync
@EnableScheduling
public class MFiIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MFiIntegrationApplication.class, args);
	}
}
