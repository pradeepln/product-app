//package com.training;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.training.dal.ProductDAO;
//import com.training.dal.ProductDAOInMemImpl;
//import com.training.service.ProductService;
//import com.training.service.ProductServiceImpl;
//import com.training.ui.ProductConsoleUI;
//
//@Configuration
//public class ProductAppConfiguration {
//
//	@Bean
//	public ProductDAO daoObj() {
//		ProductDAOInMemImpl dao = new ProductDAOInMemImpl();
//		return dao;
//	}
//	
//	@Bean
//	public ProductService serviceObj() {
//		ProductServiceImpl service = new ProductServiceImpl();
//		service.setDao(daoObj());
//		return service;
//	}
//	
//	@Bean
//	public ProductConsoleUI uiObj() {
//		ProductConsoleUI ui = new ProductConsoleUI();
//		ui.setService(serviceObj());
//		return ui;
//	}
//}
