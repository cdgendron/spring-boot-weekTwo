package com.gendronPortfolio.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.gendronPortfolio.inventoryManagement.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
