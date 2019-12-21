package com.ldingyi.cloudaddress;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ldingyi.cloudaddress.mapper")
public class CloudaddressApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudaddressApplication.class, args);
    }

}
