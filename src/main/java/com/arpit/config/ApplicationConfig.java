package com.arpit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
		@PropertySource("classpath:properties/app.properties"),
		@PropertySource("classpath:properties/app-${spring.profiles.active}.properties") })
@ComponentScan(basePackages = "com.arpit.controller")
public class ApplicationConfig {

}
