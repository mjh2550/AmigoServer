package com.spring.amigo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




//exclude={DataSourceAutoConfiguration.class}
@SpringBootApplication
public class AmigoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmigoApplication.class, args);
	}

}
