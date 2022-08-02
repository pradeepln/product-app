package com.training.dal;

import java.util.List;

import com.training.domain.Review;

public interface ReviewDAO {

	Review save(Review r);

	List<Review> findByProductId(int pid);

}