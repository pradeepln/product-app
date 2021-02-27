package com.rakuten.training.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rakuten.training.domain.Product;
import com.rakuten.training.domain.Review;

@Repository
@Transactional
public class ReviewDAOJpaImpl implements ReviewDAO {
	
	@Autowired
	EntityManager em;

	@Override
	public Review addReviewToProduct(Review r, int pId) {
		Product p = em.find(Product.class, pId);
		r.setProduct(p);
		em.persist(r);
		return r;
	}

	@Override
	public List<Review> findByProduct_Id(int pId) {
		Query q = em.createQuery("select r from Review as r where r.product.id=:x");
		q.setParameter("x", pId);
		return q.getResultList();
	}

}
