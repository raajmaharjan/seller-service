package com.seller.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.seller.entities.SellerEntity;

@Repository
@Transactional
public interface SellerRepository extends CrudRepository<SellerEntity, Long> {

	SellerEntity findByUid(String uid);
}
