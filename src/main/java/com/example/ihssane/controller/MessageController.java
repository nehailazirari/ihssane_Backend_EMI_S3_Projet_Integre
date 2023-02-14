
package com.example.ihssane.controller;

import com.example.ihssane.autres.MessageResult;
import com.example.ihssane.model.Message;
import com.example.ihssane.model.Utilisateur;
import com.example.ihssane.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private final MessageService service;

    public MessageController(MessageService service) {
        this.service = service;
    }


    @PostMapping
    public Message sendMessage(@RequestBody Message message) {
        return service.sendMessage(message);
    }

     @GetMapping("/{fromUserId}/{toUserId}")
    public List<Message> getMessages(@PathVariable("fromUserId") Long fromUserId, @PathVariable("toUserId") Long toUderId) {
        return service.getMessages(fromUserId,toUderId);

    }

    @GetMapping("/users/{fromUserId}")
    public List<Utilisateur> getUtilisateur(@PathVariable("fromUserId") Long fromUserId){
        return service.getUtilisateur(fromUserId);

    }

    @GetMapping("/getPhoto")
    public Map<Long, String> getAllPhoto(){
        return service.getAllPhoto();
    }

    @PutMapping("/{id}")
    public Message updateMessageSeen(@PathVariable Long id) {
        return service.updateMessageSeen(id);
    }
}


