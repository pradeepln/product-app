package com.rakuten.training;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rakuten.training.dal.ProductDAO;
import com.rakuten.training.domain.Product;

@SpringBootApplication
public class ProductAppApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer = 
				SpringApplication.run(ProductAppApplication.class, args);
		
//		ProductConsoleUI ui = springContainer.getBean(ProductConsoleUI.class);
//		ui.createProductWithUI();
		
//		TestCode.testFullProductDAO(springContainer);
		
//		TestCode.testCustomerDAO(springContainer);
		
//		TestCode.testProductRepository(springContainer);
	}

	

}
