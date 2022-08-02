package com.training.service;

import java.util.List;

import com.training.domain.Review;

public interface ReviewService {

	List<Review> findReviewsForProduct(int pid);

	Review addReviewToProduct(Review r, int pid);

}