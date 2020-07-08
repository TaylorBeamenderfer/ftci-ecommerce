package com.tts.eCommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.eCommerce.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	public OrderRepository orderRepository;
	
	@Autowired
	public UserService userService;
	
	
}
