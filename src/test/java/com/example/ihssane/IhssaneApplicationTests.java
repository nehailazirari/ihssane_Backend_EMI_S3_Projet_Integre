package com.example.ihssane;

import com.example.ihssane.dao.DonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IhssaneApplicationTests {

    @Autowired
    private DonRepository donRepository;

    @Autowired
    private DonneurRepository donneurRepository;

    @Test
    public void testCreateProduit(){
        //Donneur donneur=new Donneur(null,"rania","marouni","1234","marouni.rania1@gmail.com","Eljadida",new Date(),"0654345654");
        //Don don=new Vetements(null,"tricot",new Date(),"jolie",donneur);
        //Don don= donneur.creerDon(null,"tricot",new Date(),"jolie","hh",donneur);
        //donneurRepository.save(donneur);
        //donRepository.save(don);
    }


}
