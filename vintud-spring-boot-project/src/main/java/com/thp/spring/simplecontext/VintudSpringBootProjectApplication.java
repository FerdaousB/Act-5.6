package com.thp.spring.simplecontext;

import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.TransactionManager;

@SpringBootApplication
@EnableConfigurationProperties
@EnableJpaRepositories
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@EntityScan(basePackages = {"com.thp.simplecontext.entity"})
public class VintudSpringBootProjectApplication {

	
	 @Bean
	  public LocalEntityManagerFactoryBean entityManagerFactory() {
	    LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
	    factoryBean.setPersistenceUnitName("database");
	    return factoryBean;
	  }

	  @Bean
	  public TransactionManager transactionManager(EntityManagerFactory emf) {
	    return new JpaTransactionManager(emf);
	  }
	public static void main(String[] args) {
		SpringApplication.run(VintudSpringBootProjectApplication.class, args);	
	}

}
