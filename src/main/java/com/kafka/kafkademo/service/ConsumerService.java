package com.kafka.kafkademo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
  @KafkaListener(topics = "topic1",groupId = "group1")
    public void listenToTopic(String msg){
      System.out.println("Message From topic1: "+msg);
    }

}
