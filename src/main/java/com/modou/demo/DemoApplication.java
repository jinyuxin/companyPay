package com.modou.demo;

import com.modou.demo.config.StartupRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;


@EnableEurekaClient
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

    	SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public StartupRunner startupRunner() {
        return new StartupRunner();
    }
}


