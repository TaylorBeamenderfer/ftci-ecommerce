package com.tts.eCommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.tts.eCommerce.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
