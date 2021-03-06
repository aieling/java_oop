package com.perscholas.cafe;

public abstract class Product {
	private String name;
	private int price;
	private String description;
	private int quantity;
	private final double tax = 0.065;
	
	public Product() {}
	
	public Product(String name, int price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	abstract int calculateProductTotal(int price, int quantity);
	
	public double calculateTotal(int subTotal) {
		double result = subTotal + subTotal*tax;
		return result;
	}

}
