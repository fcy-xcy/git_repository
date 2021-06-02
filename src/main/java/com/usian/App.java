package com.usian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(value = {"com.usian.mapper"})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
