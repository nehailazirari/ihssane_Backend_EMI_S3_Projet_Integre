package com.example.ihssane.dao;

import com.example.ihssane.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface CategoryRepository extends JpaRepository<Category,Long> {
    //public List<String> findAllByDesignation();
    //@Query("select c from Category c where c.designation = :d")
    //public List<Don> findDonsByDesignation(String designation);
}
