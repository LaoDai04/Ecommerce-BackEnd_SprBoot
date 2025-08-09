package com.example.businessapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.businessapp.model.Customer;

@Repository
public interface EcommerceRespository extends JpaRepository<Customer, Long> {

}
