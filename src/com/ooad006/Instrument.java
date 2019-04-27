package com.ooad006;
/**
 * 乐器
 * @author Administrator
 *
 */
public abstract class Instrument {

	protected String serialNumber;
	protected double price;
	protected InstrumentSpec instrumentSpec;
	public Instrument() {
		super();
	}

	public Instrument(String serialNumber, double price, InstrumentSpec instrumentSpec) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.instrumentSpec = instrumentSpec;
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

	public InstrumentSpec getInstrumentSpec() {
		return instrumentSpec;
	}
	
}