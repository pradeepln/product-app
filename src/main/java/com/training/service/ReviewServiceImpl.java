package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.dal.ProductDAO;
import com.training.dal.ReviewDAO;
import com.training.domain.Product;
import com.training.domain.Review;

@Transactional
@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	ReviewDAO rDao;
	
	@Autowired
	ProductDAO pDao;
	
	@Override
	public List<Review> findReviewsForProduct(int pid){
		return rDao.findByProductId(pid);
	}
	
	@Override
	public Review addReviewToProduct(Review r,int pid) {
		Product p = pDao.findById(pid);
		r.setProduct(p);
		rDao.save(r);
		return r;
	}
	
	
}
