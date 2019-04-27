package com.ooad002;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.ooad002.enums.Builder;
import com.ooad002.enums.Type;
import com.ooad002.enums.Wood;

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
	public void addGuitar(String serialNumber, double price, Builder builder, String model,
						  Type type, Wood backWood, Wood topWood) {
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
			String model = searchGuitar.getModel().toLowerCase();
			if((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel().toLowerCase()))) {
				continue;
			}
			if(searchGuitar.getBuilder() != guitar.getBuilder()) {
				continue;
			}
			
			if(searchGuitar.getType() != guitar.getType()) {
				continue;
			}
			
			if(searchGuitar.getBackWood() != guitar.getBackWood()) {
				continue;
			}
			
			if(searchGuitar.getTopWood() != guitar.getTopWood()) {
				continue;
			}
			return guitar;
		}
		return null;
	}
}
