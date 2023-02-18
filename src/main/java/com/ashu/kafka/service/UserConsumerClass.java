package com.ashu.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserConsumerClass {

	@KafkaListener(topics = {"user-topic"})
    public void consumerUserData(int age){
        System.out.println("User Age is : " + age);
    }
}
