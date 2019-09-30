package com.seller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seller.dto.ProductDto;
import com.seller.dto.SellerDto;
import com.seller.service.SellerService;

@RestController
@RequestMapping("/seller")
public class SellerController {

	@Autowired
	private SellerService sellerService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void createSeller(@RequestBody SellerDto sellerDto) {
		sellerService.saveSeller(sellerDto);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public SellerDto getSellerInfo(@RequestParam String uid) {
		return sellerService.getB yUid(uid);
	}

	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public void addProduct(@RequestParam String sellerId, @RequestBody ProductDto productDto) throws Exception {
		sellerService.saveProduct(sellerId, productDto);
	}

}
