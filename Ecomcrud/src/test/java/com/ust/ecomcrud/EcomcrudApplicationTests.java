package com.ust.ecomcrud;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ust.ecomcrud.entities.Product;
import com.ust.ecomcrud.repos.ProductRepository;



@SpringBootTest
class EcomcrudApplicationTests {
	
	@Autowired
	private ProductRepository productrepository;

	@Test
	public void testCreateProduct() {
		Product product = new Product();
		product.setId(2);
		product.setTitle("HeadPhones");
		product.setPrice(4000.00);
		product.setDescription("Good pair of headphones");
		product.setCategory("In-ear Headphones");
		product.setImages("www.fakeimages.tk");
		
		productrepository.save(product);
		System.out.println(product);
	}
	
	@Test
	public void testUpdateProduct() {
		Product product = productrepository.findById(2).get();
		product.setImages("newfakeimages.com");
		productrepository.save(product);
		System.out.println(product);
	}
		

	

}
