package com.bqla.order.MqReceiver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(StreamClient.class)
@Slf4j
public class StreamReceiver {

    @StreamListener(StreamClient.INPUT)
    @SendTo(StreamClient.INPUT2)
    public String process(StreamModel msg){
        log.info("StreamModel ,{}",msg);
        return "success";
    }


    @StreamListener(StreamClient.INPUT2)
    public void process2(String msg){
        log.info("receiver ,{}",msg);
    }

}
