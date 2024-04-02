package com.example.primesservice.repository;

import com.example.primesservice.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationDBRepository extends CrudRepository<Customer, Long> {
    Customer findByUsername(String username);

}
