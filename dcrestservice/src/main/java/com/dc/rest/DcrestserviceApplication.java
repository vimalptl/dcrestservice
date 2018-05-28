package com.dc.rest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.dc.rest.mapper")
@SpringBootApplication
public class DcrestserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DcrestserviceApplication.class, args);
	}
}
