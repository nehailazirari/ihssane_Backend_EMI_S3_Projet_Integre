package com.example.ihssane.controller;

import com.example.ihssane.model.Category;
import com.example.ihssane.service.ServiceCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Category")
public class CategoryController {

    @Autowired
    private ServiceCategory serviceCategory;

    @GetMapping("/categories")
    public ResponseEntity<List<Category>> findAll() {
        List<Category> categories = serviceCategory.findAllCategories();
        return ResponseEntity.ok(categories);
    }



}
