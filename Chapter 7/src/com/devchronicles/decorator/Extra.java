package com.devchronicles.decorator;

public abstract class Extra implements Order {
	protected Order order;
	protected String label;
	protected double price;

	public Extra(String label, double price, Order order) {
		this.label = label;
		this.price = price;
		this.order = order;
	}

	// Price can be a big issue, so delegate this to concrete implementation
	public abstract double getPrice();

	// Should be okay to provide standard labeling
	public String getLabel() {
		return order.getLabel() + ", " + this.label;
	}
}