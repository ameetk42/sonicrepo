package com.sonic.VendingMachine.entity;

public class Inventory {
	
	private Product product;
	private int amountAvailable;
	
	
	
	
	
	public Inventory(Product product, int amountAvailable) {
		super();
		this.product = product;
		this.amountAvailable = amountAvailable;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getAmountAvailable() {
		return amountAvailable;
	}
	public void setAmountAvailable(int amountAvailable) {
		this.amountAvailable = amountAvailable;
	}
	@Override
	public String toString() {
		return "Inventory [product=" + product + ", amountAvailable=" + amountAvailable + "]";
	}
	
	
	

}
