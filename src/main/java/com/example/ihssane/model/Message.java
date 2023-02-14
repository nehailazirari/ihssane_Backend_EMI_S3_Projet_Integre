package com.example.ihssane.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity

public class Message{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)

    private Utilisateur fromUser;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @NotNull
    private Utilisateur toUser;

    private Timestamp createdDate;

    private Timestamp lastSeen;

    private String photoProfil;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Utilisateur getFromUser() {
        return fromUser;
    }

    public void setFromUser(Utilisateur fromUser) {
        this.fromUser = fromUser;
    }

    public Utilisateur getToUser() {
        return toUser;
    }

    public void setToUser(Utilisateur toUser) {
        this.toUser = toUser;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Timestamp lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getPhotoProfil() {
        return photoProfil;
    }

    public void setPhotoProfil(String photoProfil) {
        this.photoProfil = photoProfil;
    }
}
