package com.training.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.training.dal.ProductDAO;
import com.training.dal.ProductDAOInMemImpl;
import com.training.domain.Product;

class MockitoBasedProductServiceImplTest {

	@Test
	void addProduct_Returns_Valid_Id_When_Value_GTEQ_MinValue() {
		//AAA
		
		//Arrange
		ProductServiceImpl objectUnderTest = new ProductServiceImpl();
		Product argToTestMethod = new Product("test", ProductServiceImpl.MIN_VALUE + 1, 1);
		
		Product dataFromMock = new Product("test", ProductServiceImpl.MIN_VALUE + 1, 1);
		dataFromMock.setId(1);
		
		ProductDAO mockDAO = Mockito.mock(ProductDAO.class);
		Mockito.when(mockDAO.save(argToTestMethod)).thenReturn(dataFromMock);
		
		objectUnderTest.setDao(mockDAO);
		
		//Act
		int id = objectUnderTest.addProduct(argToTestMethod);
		
		//Assert
		assertTrue(id > 0);
	}

}
