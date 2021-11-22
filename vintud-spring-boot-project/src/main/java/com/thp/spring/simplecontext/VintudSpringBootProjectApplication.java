package com.thp.spring.simplecontext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.thp.simplecontext.entity"})
@ComponentScan(basePackages={"com.thp.simplecontext.controller",
"com.thp.simplecontext.serviceImpl","com.thp.simplecontext.mapper"})
@EnableTransactionManagement
@EnableJpaRepositories(basePackages={"com.thp.simplecontext.repository"})
public class VintudSpringBootProjectApplication {

	 	

	
	public static void main(String[] args) {
		SpringApplication.run(VintudSpringBootProjectApplication.class, args);	
	}

}
