package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.training.domain.Review;
import com.training.service.ReviewService;
import com.training.ui.ProductConsoleUI;

@SpringBootApplication
public class ProductAppApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer = 
				SpringApplication.run(ProductAppApplication.class, args);
//		ProductConsoleUI ui = springContainer.getBean(ProductConsoleUI.class);
//		ui.createProductWithUI();
		
		//testReview(springContainer);
	}

	private static void testReview(ApplicationContext springContainer) {
		Review r = new Review("This is good stuff, excellent animal", "self", 5);
		
		ReviewService reviewService = springContainer.getBean(ReviewService.class);
		reviewService.addReviewToProduct(r, 1);
		
	}

}
