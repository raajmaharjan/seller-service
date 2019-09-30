package com.seller.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.seller.entities.SellerEntity;
import com.seller.repositories.SellerRepository;
import com.seller.service.SellerService;

@RunWith(MockitoJUnitRunner.class)
public class SellerServiceTest {
	
	@Mock
	SellerRepository sellerRepository;
	
	private SellerEntity seller;
	
	@InjectMocks
	SellerService sellerService;
	
	@Before
	public void setup() {
		seller = new SellerEntity();
		seller.setName("Abinash");
		seller.setActive(true);
		seller.setCountryCode("+1");
		seller.setPhone("12342342341");
		seller.setEmail("abastola@cubic.net");
		seller.setUid("1234");
	}
	
	
	@Test
	public void testGetByUid() {
		when(sellerRepository.findByUid("1234")).thenReturn(seller);
		assertEquals("Abinash",sellerService.getByUid("1234").getName());
		assertEquals(true,sellerService.getByUid("1234").getActive());
		assertEquals("12342342341",sellerService.getByUid("1234").getPhone());
		
	}
	
}
