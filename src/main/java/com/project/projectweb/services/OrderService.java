package com.project.projectweb.services;

import com.project.projectweb.repositories.OrderRepository;
import com.project.projectweb.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }
/*
    public User findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();

    }*/
}
