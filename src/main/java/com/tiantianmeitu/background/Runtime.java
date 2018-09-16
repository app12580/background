package com.tiantianmeitu.background;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.ccmpy.lolieden.mapper")
@SpringBootApplication
public class Runtime {

	public static void main(String[] args) {
		SpringApplication.run(Runtime.class, args);
	}
}


