package com.zero.jimu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zero.jimu.dao")
public class JimuApplication {

    public static void main(String[] args) {
        SpringApplication.run(JimuApplication.class, args);
    }
}
