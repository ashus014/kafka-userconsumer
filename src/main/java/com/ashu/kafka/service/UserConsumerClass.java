package com.ashu.kafka.service;

import com.ashu.kafka.dto.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserConsumerClass {

//	@KafkaListener(topics = {"user-topic"})
//    public void consumerUserData(int age){
//        System.out.println("User Age is : " + age);
//    }

    @KafkaListener(topics = {"user-topic"})
    public void consumerUserData(User user){
        System.out.println("User Age is : " + user.getAge() + " Department : " + user.getDept());
    }
}
