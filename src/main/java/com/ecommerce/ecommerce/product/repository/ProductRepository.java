package com.ecommerce.ecommerce.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.product.entity.product;

public interface ProductRepository extends JpaRepository <product, Integer>{

}
