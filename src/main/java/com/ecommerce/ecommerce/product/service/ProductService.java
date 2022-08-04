package com.ecommerce.ecommerce.product.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.product.entity.product;
import com.ecommerce.ecommerce.product.entity.subsprod;
import com.ecommerce.ecommerce.product.repository.ProductRepository;
import com.ecommerce.ecommerce.product.repository.SubsprodRepository;

@Service
public class ProductService {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ProductRepository productRepository;
	
    @Autowired
    SubsprodRepository subsprodRepository;

	public List<product> getAllProducts() {
		return productRepository.findAll();
		// TODO Auto-generated method stub
	}

	public Optional<product> getOneProducts(int prodid) {
		// TODO Auto-generated method stub
		return productRepository.findById(prodid);
	}

	public product putallproducts(product Product) {
		// TODO Auto-generated method stub
		return productRepository.save(Product);
	}

	public List<subsprod> getallsubs() {
		// TODO Auto-generated method stub
		return subsprodRepository.findAll();
	}

	public Optional<subsprod> getonesubsprod(int buyerid) {
		// TODO Auto-generated method stub
		return subsprodRepository.findById(buyerid);
	}


	
	


}
