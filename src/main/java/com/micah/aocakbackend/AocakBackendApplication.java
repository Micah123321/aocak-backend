package com.micah.aocakbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author Micah
 */
@SpringBootApplication
@EnableOpenApi
@MapperScan("com.micah.aocakbackend.dao")
public class AocakBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AocakBackendApplication.class, args);
	}

}
