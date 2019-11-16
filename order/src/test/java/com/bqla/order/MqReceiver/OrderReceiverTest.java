package com.bqla.order.MqReceiver;

import com.bqla.order.OrderApplicationTests;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.cloud.netflix.eureka.serviceregistry.EurekaAutoServiceRegistration;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;


@Component
public class OrderReceiverTest extends OrderApplicationTests {

    @MockBean
    private EurekaAutoServiceRegistration eurekaAutoServiceRegistration;
    @Autowired
    AmqpTemplate amqpTemplate;

    @Test
    public void getOrder() {
        amqpTemplate.convertAndSend("degitalOrder","degital",new Date().toString());
    }

    @Test
    public void getFruit() {
        amqpTemplate.convertAndSend("fruitOrder","fruit",new Date().toString());
    }
}