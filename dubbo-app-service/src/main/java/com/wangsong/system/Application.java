package com.wangsong.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.wangsong.*.dao")
@ComponentScan(basePackages="com.wangsong")
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}

}