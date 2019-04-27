package com.ooad006;

import com.ooad004.enums.Builder;
import com.ooad004.enums.Type;
import com.ooad004.enums.Wood;

public class MandolinSpec extends InstrumentSpec{
	private Style style;
	
	public MandolinSpec(String model, Wood backWood, Wood topWood, Builder builder, Type type, Style style) {
		super(model, backWood, topWood, builder, type);
		this.style = style;
	}
	
	public Style getStyle() {
		return style;
	}

	public boolean matches(InstrumentSpec otherMandolinSpec) {
		if(!super.matches(otherMandolinSpec)) return false;
		if(!(otherMandolinSpec instanceof MandolinSpec)) return false;
		MandolinSpec spec = (MandolinSpec)otherMandolinSpec;
		if(spec.getStyle() != this.getStyle()) return false;
		return true;
	}
}
