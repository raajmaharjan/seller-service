package com.seller.dto;

public class ProductDto {

	private String name;
	private String description;
	private String brand;
	private Double price;
	private Boolean available;
	private String sellerUid;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public String getSellerUid() {
		return sellerUid;
	}

	public void setSellerUid(String sellerUid) {
		this.sellerUid = sellerUid;
	}		

}
