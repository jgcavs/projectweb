package com.project.projectweb;

import com.project.projectweb.entities.Order;
import com.project.projectweb.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
