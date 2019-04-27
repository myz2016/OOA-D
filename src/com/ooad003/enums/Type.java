package com.ooad003.enums;

public enum Type {
	ACOUSTIC,//原生的
	ELECTRIC;//电动的
	public String toString() {
		switch(this) {
			case ACOUSTIC: return "acoustic";
			case ELECTRIC: return "electric";
			default: return null;
		}
	}
}
