package com.aurionpro.model;

public class LineItem {
	
	private int id;
	private int quantity;
	private Product product;
	private double unitPrice;
	private double totalCost;
	
	public LineItem(int id, int quantity, Product product) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.product = product;
		this.unitPrice = product.calculateDiscountPrice();
		this.totalCost = calculateLineItemCost();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double calculateLineItemCost() {
		double cost = 0;
		cost = quantity * unitPrice;
		return cost;
	}
	
	@Override
	public String toString() {
		return "\nLineItem [id=" + id + ", Name=" + product.getName() + ", Quantity=" + quantity + ", UnitPrice=" + unitPrice + ", TotalPrice=" + totalCost + "]";
	}
	
	

}
