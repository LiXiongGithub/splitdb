package com.lx.splitdb.splitdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(value = "com.lx.splitdb.splitdb.mapper")
public class SplitdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SplitdbApplication.class, args);
	}

}
