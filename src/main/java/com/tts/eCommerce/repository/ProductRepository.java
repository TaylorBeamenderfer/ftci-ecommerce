package com.tts.eCommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.tts.eCommerce.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
