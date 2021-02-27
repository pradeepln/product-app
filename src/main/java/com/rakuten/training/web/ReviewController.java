package com.rakuten.training.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.training.dal.ReviewDAO;
import com.rakuten.training.domain.Review;

@RestController
public class ReviewController {
	
	@Autowired
	ReviewDAO reviewDAO;
	
	@PostMapping("/products/{id}/reviews")
	public ResponseEntity<Review> addReviewToProduct(@PathVariable("id") int pId,@RequestBody Review toBeAdded) {
		
		Review added = reviewDAO.addReviewToProduct(toBeAdded, pId);
		//create location header
		return new ResponseEntity<Review>(added, HttpStatus.CREATED);
	}

	@GetMapping("/products/{id}/reviews")
	public List<Review> getReviewForProduct(@PathVariable("id") int pId){
		return reviewDAO.findByProduct_Id(pId);
	}
}
