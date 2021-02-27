package com.rakuten.training.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.rakuten.training.dal.ProductDAOInMemImpl;
import com.rakuten.training.domain.Product;

class ProductServiceImplTest {

	@Test
	void addProduct_Must_Return_Valid_Id_When_Product_Value_GTEQ_10k() {
		//AAA
		//Arrange
		ProductServiceImpl objUnderTest = new ProductServiceImpl();
		Product arg = new Product("test", 10000, 1);
		
		ProductDAOInMemImpl doubleForProductDAO = new ProductDAOInMemImpl();
		objUnderTest.setDao(doubleForProductDAO);
		//Act
		int id = objUnderTest.addProduct(arg);
		//Assert
		assertTrue(id > 0);
	}

}
