package com.example.ihssane.service;

import com.example.ihssane.DAO.MessageRepository;
import com.example.ihssane.autres.MessageResult;
import com.example.ihssane.model.Message;
import com.example.ihssane.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Tuple;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MessageService {

    @Autowired
    private MessageRepository repository;

    private List<Utilisateur> users = new ArrayList<>();

    public List<Message> getMessages(Long fromUserId, Long toUserId) {
        return repository.findByFromUserIdOrToUserId(fromUserId,toUserId);
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
    public  List<Utilisateur> getUtilisateur(Long fromUserId){
        for(Utilisateur user : repository.findUsersByFromUserIdOrToUserId(fromUserId)){
            if(!users.contains(user)) users.add(user);
        }
        return repository.findUsersByFromUserIdOrToUserId(fromUserId);
    }

    public Map<Long,String> getAllPhoto(){
        Map<Long,String> map = new HashMap();
        List<Tuple> results = repository.findAllPhoto();
        for (Tuple result : results) {
            Long toUserId = result.get(0, Long.class);
            String photoProfil = result.get(1, String.class);
            map.put(toUserId,photoProfil);
        }

        return map;
    }
}
