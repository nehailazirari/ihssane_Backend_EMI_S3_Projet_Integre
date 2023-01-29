/*package com.example.ihssane.service;

import com.example.ihssane.dao.DonRepository;
//import com.example.ihssane.dao.DonneurRepository;
import com.example.ihssane.dao.UtilisateurRepository;
import com.example.ihssane.model.Don;
//import com.example.ihssane.model.Donneur;
//import com.example.ihssane.repository.DonRepository;
//import com.example.ihssane.repository.DonneurRepository;
import com.example.ihssane.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceDonneur {

    @Autowired
    private UtilisateurRepository donorRepository;
    @Autowired
    private DonRepository donRepository;

    public List<Don> getDonorDons(Long id) {
        Optional<Utilisateur> donor = donorRepository.findById(id);
        return donRepository.findDonByDonneur(donor);
    }
}*/
