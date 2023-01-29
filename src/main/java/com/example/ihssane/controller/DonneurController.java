/*package com.example.ihssane.controller;

import com.example.ihssane.model.Don;
import com.example.ihssane.service.ServiceDonneur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DonneurController {

    @Autowired
    private ServiceDonneur donorService;

    @GetMapping("/donor/{id}")
    public ResponseEntity<List<Don>> getDonorDons(@PathVariable Long id) {
        List<Don> dons = donorService.getDonorDons(id);
        if (dons.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(dons, HttpStatus.OK);
    }
}*/
