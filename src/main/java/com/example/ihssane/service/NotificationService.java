package com.example.ihssane.service;

import com.example.ihssane.DAO.NotificationRepository;
import com.example.ihssane.autres.EtatDemande;
import com.example.ihssane.model.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    public List<Notification> getAll(Long idDonneur){
        return notificationRepository.findByDonneur(idDonneur);
    }
    public  Notification sendNotify(Notification notification){
        return notificationRepository.save(notification);
    }

    /*public Notification updateNotify(Notification notification, EtatDemande etatDemande){
        notification.setEtatDemande(etatDemande);
        return notificationRepository.save(notification);
    }*/

}
