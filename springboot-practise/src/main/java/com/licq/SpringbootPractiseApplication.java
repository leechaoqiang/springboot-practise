package com.licq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2//展示api doc-可以访问地址http://localhost:8088/swagger-ui.html
@EnableScheduling//启动定时任务,需要此注解
public class SpringbootPractiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPractiseApplication.class, args);
	}
}
