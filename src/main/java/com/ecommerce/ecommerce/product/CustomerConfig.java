package com.ecommerce.ecommerce.product;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CustomerConfig {

	@Bean 
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
