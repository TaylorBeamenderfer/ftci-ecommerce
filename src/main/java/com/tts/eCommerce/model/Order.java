package com.tts.eCommerce.model;

import java.util.HashMap;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "orders")
public class Order {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "order_id")
	private Long id;
	
	private List<HashMap<Product, Integer>> orderItems;
	private Double subTotal;
	private Double grandTotal;
	
	public Order() {}

	public Order(List<HashMap<Product, Integer>> orderItems, Double subTotal, Double grandTotal) {
		this.orderItems = orderItems;
		this.subTotal = subTotal;
		this.grandTotal = grandTotal;
	}

	public List<HashMap<Product, Integer>> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<HashMap<Product, Integer>> orderItems) {
		this.orderItems = orderItems;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	public Double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(Double grandTotal) {
		this.grandTotal = grandTotal;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderItems=" + orderItems + ", subTotal=" + subTotal + ", grandTotal="
				+ grandTotal + "]";
	}
	
}
