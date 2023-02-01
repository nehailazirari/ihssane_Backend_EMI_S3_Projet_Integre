package com.example.ihssane.controller;

import com.example.ihssane.autres.EtatDemande;
import com.example.ihssane.model.Notification;
import com.example.ihssane.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/notification")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;
    @GetMapping("/getALL/{idDonneur}")
    public List<Notification> getAll(@PathVariable("idDonneur") Long idDonneur){
        return this.notificationService.getAll(idDonneur);
    }

    @PostMapping
    public Notification sendNotify(@RequestBody Notification notification){
        return this.notificationService.sendNotify(notification);
    }

    /*@PutMapping("/updateNotification/{etatDemande}")
    public Notification updateNotify(@RequestBody Notification notification, @PathVariable("etatDemande")EtatDemande etatDemande){
        return this.notificationService.updateNotify(notification,etatDemande);
    }*/


}
