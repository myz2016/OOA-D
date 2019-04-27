package com.ooad006;

public enum Style {
	F,A;
	public String toString() {
		switch (this) {
		case F: return "f";
		case A: return "a";
		default: return  null;
		}
	}
}
