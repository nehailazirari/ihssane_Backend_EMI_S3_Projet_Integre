package com.example.ihssane.repository;

import com.example.ihssane.model.Donneur;
import org.springframework.data.jpa.repository.JpaRepository;


//@RepositoryRestResource
public interface DonneurRepository extends JpaRepository<Donneur,Long> {
}
