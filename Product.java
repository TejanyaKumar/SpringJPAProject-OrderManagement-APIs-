package com.flm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long productId;

	@Column(nullable = false, unique = true)
	private String productName;

	@Column(nullable = false)
	private double price;

	private double discount;

	private double rating;

	@Column(nullable = false)
	private boolean isAvailable;

	@Column(nullable = false)
	private int stock;

	public Product() {

	}


	public long getProductId() {
		return productId;
	}


	public void setProductId(long productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


	public boolean isAvailable() {
		return isAvailable;
	}


	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public Product(String productName, double price, double discount, double rating, boolean isAvailable, int stock) {
		super();
		this.productName = productName;
		this.price = price;
		this.discount = discount;
		this.rating = rating;
		this.isAvailable = isAvailable;
		this.stock = stock;
	}



}
