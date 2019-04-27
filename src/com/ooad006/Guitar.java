package com.ooad006;

/**
 * 吉他
 * @author Administrator
 *
 */
public class Guitar extends Instrument {
	public Guitar(String serialNumber, GuitarSpec spec, double price) {
		super(serialNumber, price, spec);
	}
}
