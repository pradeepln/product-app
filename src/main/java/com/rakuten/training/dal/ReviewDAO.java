package com.rakuten.training.dal;

import java.util.List;

import com.rakuten.training.domain.Review;

public interface ReviewDAO {
	
	public Review addReviewToProduct(Review r,int pId);
	public List<Review> findByProduct_Id(int pId);

}
