package com.example.ihssane.controller;

import com.example.ihssane.model.Message;
import com.example.ihssane.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MessageService service;


    @PostMapping
    public Message sendMessage(@RequestBody Message message) {
        return service.sendMessage(message);
    }

    @GetMapping("/{userId}")
    public List<Message> getMessages(@PathVariable Long userId) {
        return service.getMessages(userId);
    }

    @PutMapping("/{id}")
    public Message updateMessageSeen(@PathVariable Long id) {
        return service.updateMessageSeen(id);
    }
}

