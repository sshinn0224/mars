package com.example.mars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarsApplication.class, args);
    }

}
