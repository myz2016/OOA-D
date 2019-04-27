package com.ooad001;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 库存储物表
 * @author Administrator
 *
 */
public class Inventory {
	private List<Guitar> guitars;
	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}
	public void addGuitar(String serialNumber, double price, String builder, String model,
						  String type, String backWood, String topWood) {
		Guitar g = new Guitar(serialNumber, builder, model, type, backWood, topWood, price);
		this.guitars.add(g);
	}
	public Guitar getGuitar(String serialNumber) {
		for(Iterator<Guitar> i = this.guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();
			if(guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}
	public Guitar search(Guitar searchGuitar) {
		for(Iterator<Guitar> i = this.guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();
			String builder = searchGuitar.getBuilder();
			if((builder != null) && (!builder.equals("")) && (!builder.equals(guitar.getBuilder()))) {
				continue;
			}
			String type = searchGuitar.getType();
			if((type != null) && (!type.equals("")) && (!type.equals(guitar.getType()))) {
				continue;
			}
			String backWood = searchGuitar.getBackWood();
			if((backWood != null) && (!backWood.equals("")) && (!backWood.equals(guitar.getBackWood()))) {
				continue;
			}
			String topWood = searchGuitar.getTopWood();
			if((topWood != null) && (!topWood.equals("")) && (!topWood.equals(guitar.getTopWood()))) {
				continue;
			}
			return guitar;
		}
		return null;
	}
}
