package org.itstack.demo.design;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("org.itstack.demo.design")
@SpringBootApplication
public class MybatisSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisSampleApplication.class, args);
	}

}
