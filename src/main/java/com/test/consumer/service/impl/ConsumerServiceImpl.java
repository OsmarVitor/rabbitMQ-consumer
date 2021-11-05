package com.test.consumer.service.impl;

import com.test.consumer.dto.Message;
import com.test.consumer.service.ConsumerService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    public void action(Message message) {
        System.out.println("####### " + message.getMessage());
    }
}
