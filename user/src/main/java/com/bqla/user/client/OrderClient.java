package com.bqla.user.client;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="order")
public interface OrderClient {

    @GetMapping("/order/testHystrix")
    String testHystrix();

    /*@Component
    public static class OrderClientFallback implements OrderClient{

        @Override
        public String testHystrix() {
            return "feign fallbck";
        }
    }*/

}
