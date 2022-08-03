package com.training.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.training.dal.ProductDAOInMemImpl;
import com.training.domain.Product;

class ProductServiceImplTest {

	@Test
	void addProduct_Returns_Valid_Id_When_Value_GTEQ_MinValue() {
		//AAA
		
		//Arrange
		ProductServiceImpl objectUnderTest = new ProductServiceImpl();
		Product argToTestMethod = new Product("test", ProductServiceImpl.MIN_VALUE + 1, 1);
		
		ProductDAOInMemImpl fakeDAO = new ProductDAOInMemImpl();
		objectUnderTest.setDao(fakeDAO);
		
		//Act
		int id = objectUnderTest.addProduct(argToTestMethod);
		
		//Assert
		assertTrue(id > 0);
	}

}
