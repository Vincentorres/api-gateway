package com.bqla.product.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ProductController {




    @GetMapping("/msg")
    public String getMsg(String type){
        log.info("ProductController feign 调用成功");
        return "ProductController feign 调用成功";
    }

}
