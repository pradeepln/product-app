package com.training.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.training.domain.Review;

@Transactional
@Repository
public class ReviewDAOImpl implements ReviewDAO {
	
	@Autowired
	EntityManager em;
	
	@Override
	public Review save(Review r) {
		em.persist(r);
		return r;
	}
	
	@Override
	public List<Review> findByProductId(int pid){
		Query q = em.createQuery("select r from Review r where r.product.id=:pid");
		q.setParameter("pid", pid);
		return q.getResultList();
	}
	

}
