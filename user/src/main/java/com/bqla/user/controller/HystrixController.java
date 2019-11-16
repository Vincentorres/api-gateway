package com.bqla.user.controller;

import com.bqla.user.client.OrderClient;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DefaultProperties(defaultFallback = "defaultFallback")
public class HystrixController {

    @Autowired
    private OrderClient orderClient;

//    @HystrixCommand(fallbackMethod = "fallbackMethod",commandProperties = {
//            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="3000"),
//            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),  				//设置熔断
//			@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),	//请求数达到后才计算
//			@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"), //休眠时间窗
//			@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),	//错误率
//    })
    @HystrixCommand
    @GetMapping("user/testHystrix")
    public String testHystrix(){
        String result = orderClient.testHystrix();
        return result;
    }

    /**
     * 容错降级方法
     * @return
     */
    private String  fallbackMethod(){
        return "fallbackMethod result";
    }

    private String  defaultFallback(){
        return "defaultFallback: fallbackMethod result";
    }


}
