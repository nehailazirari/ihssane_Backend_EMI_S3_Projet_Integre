package com.example.ihssane.service;

import com.example.ihssane.DAO.DonRepo;
import com.example.ihssane.model.Don;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public  class DonService implements Serializable {
    @Autowired
    private DonRepo donRepo;
    public Don getDonById(Long id) {

        return donRepo.findById(id).get();
    }
}
