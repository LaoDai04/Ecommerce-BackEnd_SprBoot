package com.example.businessapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.businessapp.repository.CustomerRepository;
import com.example.businessapp.model.Customer;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerRepository repo;

    public CustomerController(CustomerRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return repo.findAll();
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return repo.save(customer);
    }

        
}
