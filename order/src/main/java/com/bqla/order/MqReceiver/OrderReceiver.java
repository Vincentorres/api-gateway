package com.bqla.order.MqReceiver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class OrderReceiver {

    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange("degitalOrder"),
            key = "degital",
            value = @Queue("degitalOrder")
    ))
    public void getOrder(String msg){
        log.info("degital time:{}",msg);
    }

    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange("fruitOrder"),
            key = "fruit",
            value = @Queue("fruitOrder")
    ))
    public void getFruit(String msg){
        log.info("fruit time:{}",msg);
    }
}
