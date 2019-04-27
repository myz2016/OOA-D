package com.ooad005;

/**
 * 吉他
 * @author Administrator
 *
 */
public class Guitar {
	private String serialNumber;
	private double price;
	private GuitarSpec gs;
	public Guitar(String serialNumber, GuitarSpec gs, double price) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.gs = gs;
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
	public GuitarSpec getGs() {
		return gs;
	}
}
