package com.training.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.training.domain.Product;

@Transactional
@Primary
@Repository
public class ProductDAOJpaImpl implements ProductDAO {

	@Autowired
	EntityManager em;
	
	// b4 the control goes into method: check if caller has done begin, else do begin
	@Override
	public Product save(Product toBeSaved) {
		// toBeSaved -----> new
		em.persist(toBeSaved);
		// toBeSaved -----> managed
		//toBeSaved.setPrice(toBeSaved.getPrice() + 1);
		//toBeSaved.setQoh(toBeSaved.getQoh() - 1);
		return toBeSaved;
	}
	// once the method is complete, b4 it goes to caller, complete the tx if started by self

	@Override
	public Product findById(int id) {
		Product p = em.find(Product.class, id);
		return p;
	}

	@Override
	public List<Product> findAll() {
		Query q = em.createQuery("select p from Product as p");
		return q.getResultList();
	}

	@Override
	public void deleteById(int id) {
		Query q = em.createQuery("delete from Product p where p.id=:idParam");
		q.setParameter("idParam", id);
		q.executeUpdate();
		//Product p = em.find(Product.class, id);
		//p ----> managed
		//em.remove(p);
		//p ---> new 
	}

}
