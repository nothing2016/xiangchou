package com.xiangchou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * @author oudaming
 * @date 2019/4/4 0004 10:50
 */
@SpringBootApplication
@EnableEurekaServer
public class XcRegistry {
    public static void main(String[] args) {
        SpringApplication.run(XcRegistry.class,args);
    }
}
