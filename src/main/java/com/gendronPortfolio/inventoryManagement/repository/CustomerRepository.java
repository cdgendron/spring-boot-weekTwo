package com.gendronPortfolio.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.gendronPortfolio.inventoryManagement.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
