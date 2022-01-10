package com.ecommerce.ecommerceApp.repository;

import com.ecommerce.ecommerceApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
