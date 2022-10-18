package com.fayeyufan.ecommerce.dao;

import com.fayeyufan.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
