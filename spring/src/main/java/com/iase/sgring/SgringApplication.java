package com.iase.sgring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SgringApplication extends SpringBootServletInitializer {

	private static Class<SgringApplication> applicationClass = SgringApplication.class;

	public static void main(String[] args) {
		SpringApplication.run(SgringApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(applicationClass);
	}

	private static Class<SgringApplication> aplicationClass = SgringApplication.class;
}
