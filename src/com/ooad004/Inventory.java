package com.ooad004;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.ooad004.enums.Builder;
import com.ooad004.enums.Type;
import com.ooad004.enums.Wood;

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
		Guitar g = new Guitar(serialNumber, new GuitarSpec(builder, model, type, backWood, topWood), price);
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
	public List<Guitar> search(GuitarSpec searchGuitar) {
		List<Guitar> matchGuitars = new LinkedList<Guitar>();
		for(Iterator<Guitar> i = this.guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();
			GuitarSpec gs = guitar.getGs();
			String model = searchGuitar.getModel().toLowerCase();
			if((model != null) && (!model.equals("")) && (!model.equals(gs.getModel().toLowerCase()))) {
				continue;
			}
			
			if(searchGuitar.getBuilder() != gs.getBuilder()) {
				continue;
			}
			
			if(searchGuitar.getType() != gs.getType()) {
				continue;
			}
			
			if(searchGuitar.getBackWood() != gs.getBackWood()) {
				continue;
			}
			
			if(searchGuitar.getTopWood() != gs.getTopWood()) {
				continue;
			}
			matchGuitars.add(guitar);
		}
		return matchGuitars;
	}
}
