package com.ooad003.enums;
/**
 * 创造人
 * @author Administrator
 *
 */
public enum Builder {
	FENDER,//芬德
	MARTIN,
	GIBSON,
	COLLINGS,
	OLSON,
	RYAN,
	PRS,
	ANY;
	public String toString() {
		switch(this) {
			case FENDER: return "fender";
			case MARTIN: return "martin";
			case GIBSON: return "gibson";
			case COLLINGS: return "collings";
			case OLSON: return "olson";
			case RYAN: return "ryan";
			case PRS: return "prs";
			case ANY: return "any";
			default: return null;
		}
	}
}
