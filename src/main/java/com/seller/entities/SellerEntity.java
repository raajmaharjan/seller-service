package com.seller.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "seller")
public class SellerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="uid")
	private String uid;

	@Column(name = "name")
	private String name;

	@Column(name = "phone")
	private String phone;

	@Column(name = "country_code")
	private String countryCode;

	@Column(name = "email")
	private String email;

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "active")
	private Boolean active;
	
	@OneToOne(mappedBy = "seller")
	private SellerLoginEntity sellerLogin;

	@PrePersist
	public void onCreate() {
		if (this.createdAt == null) {
			this.createdAt = new Date();
		}
		if (this.active == null) {
			this.active = true;
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public SellerLoginEntity getSellerLogin() {
		return sellerLogin;
	}

	public void setSellerLogin(SellerLoginEntity sellerLogin) {
		this.sellerLogin = sellerLogin;
	}
	
}
