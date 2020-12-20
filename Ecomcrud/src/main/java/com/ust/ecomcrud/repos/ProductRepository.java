package com.ust.ecomcrud.repos;

import org.springframework.data.repository.CrudRepository;

import com.ust.ecomcrud.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
