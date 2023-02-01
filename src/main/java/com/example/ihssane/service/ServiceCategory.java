package com.example.ihssane.service;

import com.example.ihssane.model.Category;
import com.example.ihssane.DAO.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceCategory {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAllCategories(){
        return categoryRepository.findAll();
    }

    public Optional<Category> findCategoryById(Long id){
        return categoryRepository.findById(id);
    }

    public void deleteCategoryById(Long id){
        categoryRepository.deleteById(id);
    }

    public void save(Category category){
        categoryRepository.save(category);
    }
}
