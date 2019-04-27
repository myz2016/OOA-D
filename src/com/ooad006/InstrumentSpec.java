package com.ooad006;

import com.ooad004.enums.Builder;
import com.ooad004.enums.Type;
import com.ooad004.enums.Wood;

public class InstrumentSpec {
	String model;
	protected Wood backWood;
	protected Wood topWood;
	protected Builder builder;
	protected Type type;
	public InstrumentSpec(String model, Wood backWood, Wood topWood, Builder builder, Type type) {
		super();
		this.model = model;
		this.backWood = backWood;
		this.topWood = topWood;
		this.builder = builder;
		this.type = type;
	}


	public InstrumentSpec() {
		super();
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
	
	public boolean matches(InstrumentSpec otherInstrumentSpec) {
		String model = otherInstrumentSpec.getModel().toLowerCase();
		if((model != null) && (!model.equals("")) && (!model.equals(this.getModel().toLowerCase())))  return false;
		if(otherInstrumentSpec.getBuilder() != this.getBuilder()) return false;
		if(otherInstrumentSpec.getType() != this.getType()) return false;
		if(otherInstrumentSpec.getBackWood() != this.getBackWood()) return false;
		if(otherInstrumentSpec.getTopWood() != this.getTopWood()) return false;
		return true;
	}

}