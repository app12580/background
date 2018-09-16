package com.tiantianmeitu.background;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

//@MapperScan(value = "com.ccmpy.lolieden.mapper")
//@SpringBootApplication
public class WarTime extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(WarTime.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(WarTime.class);
	}

}
