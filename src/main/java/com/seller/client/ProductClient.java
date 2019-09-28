package com.seller.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.seller.dto.ProductDto;

@Component
public class ProductClient {
	
	@Value("${product.service.url}")
	private String url;

	public void saveProduct(ProductDto product) {
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<ProductDto> request = new HttpEntity(product);
		HttpEntity response = restTemplate.postForObject(url, request, HttpEntity.class);
		
	}
}
