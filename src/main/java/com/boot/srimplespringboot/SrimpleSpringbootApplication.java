package com.boot.srimplespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SrimpleSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SrimpleSpringbootApplication.class, args);
    }

}
