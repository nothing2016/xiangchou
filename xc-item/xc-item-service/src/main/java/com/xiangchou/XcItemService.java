package com.xiangchou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author oudaming
 * @date 2019/4/4 0004 11:34
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.xiangchou.item.service.mapper") // 扫描mapper包
public class XcItemService {
    public static void main(String[] args) {
        SpringApplication.run(XcItemService.class,args);
    }
}
