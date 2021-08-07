package com.nju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author maw-b
 * @date 2021/6/8 10:29
 */
//@MapperScan("com.nju.mapper")
@SpringBootApplication
public class SpringClickhouseApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringClickhouseApplication.class,args);
    }
}
