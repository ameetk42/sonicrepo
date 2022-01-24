package com.sonic.VendingMachine.entity;

public class Product {
	
	private int id;
	private String productName;
	private int productPrice;
	
	
	
	public Product(int id, String productName, int productPrice) {
		super();
		this.id = id;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productPrice=" + productPrice + "]";
	}
	
	
	
	
	
	
	

}
