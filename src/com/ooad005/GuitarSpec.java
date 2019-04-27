package com.ooad005;

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
	private int numStrings;
	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
		super();
		this.backWood = backWood;
		this.topWood = topWood;
		this.model = model;
		this.builder = builder;
		this.type = type;
		this.numStrings = numStrings;
	}
	
	public int getNumStrings() {
		return numStrings;
	}

	public void setNumStrings(int numStrings) {
		this.numStrings = numStrings;
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
	
	public boolean matches(GuitarSpec otherGuitarSpec) {
		String model = otherGuitarSpec.getModel().toLowerCase();
		if((model != null) && (!model.equals("")) && (!model.equals(this.getModel().toLowerCase())))  return false;
		if(otherGuitarSpec.getBuilder() != this.getBuilder()) return false;
		if(otherGuitarSpec.getType() != this.getType()) return false;
		if(otherGuitarSpec.getBackWood() != this.getBackWood()) return false;
		if(otherGuitarSpec.getTopWood() != this.getTopWood()) return false;
		if(otherGuitarSpec.getNumStrings() != this.getNumStrings()) return false;
		return true;
	}
}
