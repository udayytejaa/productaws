package com.ecommerce.ecommerce.product.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommerce.product.entity.product;
import com.ecommerce.ecommerce.product.entity.subsprod;
import com.ecommerce.ecommerce.product.service.ProductService;

@RestController
@CrossOrigin
public class ProductController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
	ProductService productService;
    


    @GetMapping("/products")
    public List<product> getAllProducts() {
    return	productService.getAllProducts();
    }
    
    @GetMapping("/products/{prodid}")
    public Optional<product> getOneProducts(@PathVariable Integer prodid) {
    return	productService.getOneProducts(prodid);
    }
    
    @PostMapping("/product")
    public product putallproducts(@RequestBody  product Product){
		return productService.putallproducts(Product);
    	
    }
    
    @GetMapping("/subsprod")
    public List<subsprod> getallsubs() {
    	return  productService.getallsubs();
    	
    }
     
    
    @GetMapping("/subsprod/{buyerid}")
    public Optional<subsprod> getonesubsprod(@PathVariable Integer buyerid){
		return productService.getonesubsprod(buyerid);
    	
    }
    
}
