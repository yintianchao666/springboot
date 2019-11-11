package com.ytc.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
       // SpringApplication.run(SpringbootApplication.class, args);
        //变更配置文件读取位置启动
        new SpringApplicationBuilder(SpringbootApplication.class)
                .properties("spring.config.location=classpath:/springbootconfig.properties").run(args);
    }

}
