package com.example.producer.controller;

import com.example.producer.dto.MessageDTO;
import com.example.producer.service.KafkaProducerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private final KafkaProducerService kafkaProducerService;

    public MessageController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @PostMapping
    public void publish(@RequestBody MessageDTO messageDTO) {
        String message = String.format("%s: %s (at %d)",
                messageDTO.getSender(),
                messageDTO.getMessage(),
                messageDTO.getTimestamp());
        kafkaProducerService.sendMessage("messages", message);
    }
}