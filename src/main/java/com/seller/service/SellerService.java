package com.seller.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.seller.client.ProductClient;
import com.seller.dto.ProductDto;
import com.seller.dto.SellerDto;
import com.seller.entities.SellerEntity;
import com.seller.entities.SellerLoginEntity;
import com.seller.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Autowired
	private ProductClient productClient;
	
	public void saveSeller(SellerDto sellerDto) {
		
		SellerEntity seller = new SellerEntity();
		seller.setName(sellerDto.getName());
		seller.setActive(true);
		seller.setCountryCode(sellerDto.getCountryCode());
		seller.setPhone(sellerDto.getPhone());
		seller.setEmail(sellerDto.getEmail());
		seller.setUid(UUID.randomUUID().toString());
		
		SellerLoginEntity login = new SellerLoginEntity();
		login.setUserName(sellerDto.getUserId());
		login.setPassword(sellerDto.getPassword());
		login.setSeller(seller);
		
//		seller.setSellerLogin(login);
		
		sellerRepository.save(seller);
		
	}
	
	public void saveProduct(String sellerId, ProductDto product) throws Exception {
		SellerEntity sller = sellerRepository.findByUid(sellerId);
		if(sller != null) {
			product.setSellerUid(sller.getUid());
			productClient.saveProduct(product);
		} else {
			throw new Exception("Seller doesnt exist");
		}
	}

}
