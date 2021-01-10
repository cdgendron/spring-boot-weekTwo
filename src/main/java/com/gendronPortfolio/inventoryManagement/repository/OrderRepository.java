package com.gendronPortfolio.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.gendronPortfolio.inventoryManagement.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
