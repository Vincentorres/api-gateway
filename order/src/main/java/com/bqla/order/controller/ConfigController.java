package com.bqla.order.controller;

import com.bqla.order.config.GirlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Autowired
    GirlConfig girlConfig;

    @GetMapping("/girl/getGirlCfg")
    public String getGirlCfg(){
        return "name:_"+girlConfig.getName()+"___age:_"+girlConfig.getAge();
    }
}
