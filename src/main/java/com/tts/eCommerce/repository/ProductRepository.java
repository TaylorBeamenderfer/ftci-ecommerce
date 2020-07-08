package com.tts.eCommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tts.eCommerce.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

	public List<Product> findAll();
	public Product findById(long id);
	public List<Product> findByBrand(String brand);
	public List<Product> findByCategory(String category);
	public List<Product> findByBrandAndCategory(String brand, String category);

	@Query("SELECT DISTINCT product.brand FROM Product product")
	public List<String> findDistinctBrands();

	@Query("SELECT DISTINCT product.category FROM Product product")
	public List<String> findDistinctCategories();
}
