package com.zking.q03;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.zking.q03.mapper")
@EnableTransactionManagement
@EnableScheduling
public class Q03Application {

	public static void main(String[] args) {
		SpringApplication.run(Q03Application.class, args);
	}
}
