package br.com.lucas.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@SpringBootApplication
@EnableJpaRepositories
@EnableAutoConfiguration(exclude = LiquibaseAutoConfiguration.class)
public class Application {

	public static void main(String[] args) throws Exception {
		 
        SpringApplication.run(Application.class, args);
 
    }
}
