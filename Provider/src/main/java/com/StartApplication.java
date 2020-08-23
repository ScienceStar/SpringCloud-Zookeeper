package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName StartApplication
 * @Description: TODO
 * @Author lxc
 * @Date 2020/8/23 13:36
 * @Version V1.0
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class StartApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class,args);
    }
}
