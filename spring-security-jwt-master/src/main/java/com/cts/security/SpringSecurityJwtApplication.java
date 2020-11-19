package com.cts.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class SpringSecurityJwtApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtApplication.class, args);
	}
	
	public WebMvcConfigurer corsConfig(){
		return new WebMvcConfigurer() {
			
			public void addCorsMapping(CorsRegistry corsRegistry){
				corsRegistry.addMapping("/*").allowedHeaders("*").allowedMethods("*")
				.allowCredentials(true).allowedOrigins("http://localhost:4200");
			}
		};
	}
	
//	public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("http://localhost:4200")
//                .allowedMethods("GET","POST");
//    }


}
