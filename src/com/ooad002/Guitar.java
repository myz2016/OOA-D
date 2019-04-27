package com.ooad002;

import com.ooad002.enums.Builder;
import com.ooad002.enums.Type;
import com.ooad002.enums.Wood;

public class Guitar {
	private String serialNumber, model;
	private Wood backWood,topWood;
	private Builder builder;
	private Type type;
	private double price;
	public Guitar(String serialNumber, Builder builder, String model, Type type, Wood backWood, Wood topWood, double price) {
		super();
		this.serialNumber = serialNumber;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public Builder getBuilder() {
		return builder;
	}
	public String getModel() {
		return model;
	}
	public Type getType() {
		return type;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public Wood getTopWood() {
		return topWood;
	}
	
}
