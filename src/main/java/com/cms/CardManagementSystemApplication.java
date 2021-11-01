package com.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by sdrahnea
 * Date: 2021-11-01
 */
@EnableSwagger2
@EnableAutoConfiguration
@SpringBootApplication
@EnableJpaRepositories
@ComponentScan
public class CardManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CardManagementSystemApplication.class, args);
    }
}
