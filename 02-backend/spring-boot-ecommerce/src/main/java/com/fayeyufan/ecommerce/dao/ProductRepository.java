package com.fayeyufan.ecommerce.dao;

import com.fayeyufan.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,  Long> {
}
