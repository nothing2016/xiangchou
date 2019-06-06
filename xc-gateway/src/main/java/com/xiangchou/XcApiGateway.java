package com.xiangchou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author oudaming
 * @date 2019/4/4 0004 10:50
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class XcApiGateway {
    public static void main(String[] args) {
        SpringApplication.run(XcApiGateway.class,args);
    }
}
