package com.rakuten.training;

import java.util.List;

import org.springframework.context.ApplicationContext;

import com.rakuten.training.dal.CustomerDAO;
import com.rakuten.training.dal.ProductDAO;
import com.rakuten.training.dal.repos.ProductRepository;
import com.rakuten.training.domain.Customer;
import com.rakuten.training.domain.Product;

public class TestCode {

	public static void testFullProductDAO(ApplicationContext springContainer) {

		ProductDAO dao = springContainer.getBean(ProductDAO.class);

		Product aProduct = new Product("test", 12334, 123);
		Product saved = dao.save(aProduct);
		System.out.println("Saved Product with id : " + saved.getId());

		List<Product> all = dao.findAll();
		System.out.println("there are " + all.size() + " products.");
		System.out.println("Removing newly added product....");
		dao.deleteById(saved.getId());

	}

	public static void testCustomerDAO(ApplicationContext springContainer) {
		CustomerDAO dao = springContainer.getBean(CustomerDAO.class);
		
//		Customer c = new Customer("fn", "ln", "fn.ln@a.com");
//		dao.save(c);
		
		List<Customer> l = dao.findByFirstName("fn");
		System.out.println(l.size());
		
	}

	public static void testProductRepository(ApplicationContext springContainer) {
		ProductRepository repo = springContainer.getBean(ProductRepository.class);
		
		Product p = new Product("repo", 1223f, 100);
		
		Product saved = repo.save(p);
		
		System.out.println("Saved product with id : "+saved.getId());
	}

}
