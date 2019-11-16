package com.bqla.order.controller;

import com.bqla.order.client.ProductClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderController {

    @Autowired
    ProductClient productClient;

    @GetMapping("/order/msg")
    public String getMsg(){
        String type = "1";
        log.info("/order/msg");
        return productClient.getMsg(type);
    }

    @GetMapping("/order/testHystrix")
    public String testHystrix(){
        return "请求order testHystrix 成功";
    }
}
