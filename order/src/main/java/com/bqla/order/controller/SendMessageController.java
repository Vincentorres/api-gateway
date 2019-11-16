package com.bqla.order.controller;

import com.bqla.order.MqReceiver.StreamClient;
import com.bqla.order.MqReceiver.StreamModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController {

    @Autowired
    private StreamClient streamClient;

    /**
     * 发送 orderDTO对象
     */
    @GetMapping("/sendMessage")
    public void process() {
        StreamModel streamModel = new StreamModel();
        streamModel.setHobby("hobby");
        streamModel.setName("name");
        streamClient.output().send(MessageBuilder.withPayload(streamModel).build());
    }

}
