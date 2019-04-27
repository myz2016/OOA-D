package com.ooad006;

import com.ooad004.enums.Builder;
import com.ooad004.enums.Type;
import com.ooad004.enums.Wood;

/**
 * 吉他特性
 * @author Administrator
 *
 */
public class GuitarSpec extends InstrumentSpec {
	private int numStrings;
	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
		super(model, backWood, topWood, builder, type);
		this.numStrings =numStrings;
	}
	
	public int getNumStrings() {
		return numStrings;
	}

	public boolean matches(InstrumentSpec otherSpec) {
		if(!super.matches(otherSpec)) return false;
		if(!(otherSpec instanceof GuitarSpec)) return false;
		GuitarSpec gs = (GuitarSpec)otherSpec;
		if(gs.getNumStrings() != this.getNumStrings()) return false;
		return true;
	}
}
