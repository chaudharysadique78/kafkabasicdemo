package com.kafka.kafkademo.controller;


import com.kafka.kafkademo.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class KafkaController {

    @Autowired
    private ProducerService producerService;
    @GetMapping("/msg")
    public String message(@RequestParam String msg){
        producerService.sendMessage(msg);
        return "Message Deliver";
    }
}
