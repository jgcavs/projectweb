package com.project.projectweb.services;

import com.project.projectweb.repositories.CategoryRepository;
import com.project.projectweb.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }
/*
    public User findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();

    }*/
}
