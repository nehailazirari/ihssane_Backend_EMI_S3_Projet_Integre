package com.example.ihssane.service;

/*import com.example.ihssane.dao.MessageRepository;
import com.example.ihssane.dao.MessageRepository;
import com.example.ihssane.model.Message;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

/*@Service
public class MessageService {

    @Autowired
    private MessageRepository repository;

    public List<Message> getMessages(Long userId) {
        return repository.findByFromUserIdOrToUserId(userId,userId);
    }

    public Message sendMessage(Message message) {
        message.setCreatedDate(new Timestamp(System.currentTimeMillis()));
        return repository.save(message);
    }
    public Message updateMessageSeen(Long id) {
        Message message = repository.findById(id).orElseThrow(() -> new RuntimeException("Message not found"));
        message.setLastSeen(new Timestamp(System.currentTimeMillis()));
        return repository.save(message);
    }

}*/
