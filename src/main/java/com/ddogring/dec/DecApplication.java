package com.ddogring.dec;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ddogring.dec.mapper")
public class DecApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecApplication.class, args);
    }

}
