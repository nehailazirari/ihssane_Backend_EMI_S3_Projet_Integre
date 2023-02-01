package com.example.ihssane.dao;

import com.example.ihssane.model.Don;
import com.example.ihssane.model.Donneur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DonneurRepository extends JpaRepository<Donneur,Long> {

    public List<Don> findDonsById(Long id);
}
