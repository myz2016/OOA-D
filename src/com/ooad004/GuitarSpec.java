package com.ooad004;

import com.ooad004.enums.Builder;
import com.ooad004.enums.Type;
import com.ooad004.enums.Wood;

/**
 * 吉他特性
 * @author Administrator
 *
 */
public class GuitarSpec {
	private Wood backWood, topWood;
	private String model;
	private Builder builder;
	private Type type;
	
	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		super();
		this.backWood = backWood;
		this.topWood = topWood;
		this.model = model;
		this.builder = builder;
		this.type = type;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public Wood getTopWood() {
		return topWood;
	}
	public String getModel() {
		return model;
	}
	public Builder getBuilder() {
		return builder;
	}
	public Type getType() {
		return type;
	}
	
}
