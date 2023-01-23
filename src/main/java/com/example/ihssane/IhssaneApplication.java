package com.example.ihssane;

import com.example.ihssane.dao.UtilisateurRepository;
import com.example.ihssane.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IhssaneApplication {

    public static void main(String[] args) {

        SpringApplication.run(IhssaneApplication.class, args);
    }

}
