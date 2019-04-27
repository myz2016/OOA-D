package com.ooad005;

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
	public void addGuitar(String serialNumber, double price, GuitarSpec gs) {
		Guitar g = new Guitar(serialNumber, gs, price);
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
			if(guitar.getGs().matches(searchGuitar)) {
				matchGuitars.add(guitar);
			}
		}
		return matchGuitars;
	}
}
