package com.rakuten.training.dal.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rakuten.training.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
	
	public List<Product> findByPrice(float p);// select x from Product where x.price=:p
	public List<Product> findByPriceLessThan(float p);// select x from Product where x.price<:p

}
