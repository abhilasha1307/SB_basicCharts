package com.Example.charts.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
@Configuration
@EnableWebMvc
@EnableAutoConfiguration
@ComponentScan (basePackages= {"com.Example.charts.ws.ui.controller"})
public class ChartsWsApplication extends WebMvcConfigurationSupport{
	
	public static void main(String[] args) {
		SpringApplication.run(ChartsWsApplication.class, args);
	}
	
	  @Bean
	    public WebMvcConfigurer corsConfigurer() {
	        return new WebMvcConfigurer() {
	            @Override
	            public void addCorsMappings(CorsRegistry registry) {
	                registry.addMapping("/**").allowedOrigins("*")
	                .allowedHeaders("*")
	                .allowedMethods("*");
	            }
	        };
	    }
	  

	 
}
