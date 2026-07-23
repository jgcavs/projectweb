package com.project.projectweb.services;

import com.project.projectweb.repositories.ProductRepository;
import com.project.projectweb.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }
/*
    public User findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();

    }*/
}
