package com.example.ihssane.DAO;

import com.example.ihssane.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface CategoryRepository extends JpaRepository<Category,Long> {
    //public List<String> findAllByDesignation();
}
