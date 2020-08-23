package com.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName OrderController
 * @Description: TODO
 * @Author lxc
 * @Date 2020/8/23 13:58
 * @Version V1.0
 **/
@RestController
@Slf4j
public class OrderController {
    public static final String PAYMENT_URL = "http://SpringCloud-Zookeeper";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/payment/zk")
    public String paymentzk(){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/zk", String.class);
    }
}
