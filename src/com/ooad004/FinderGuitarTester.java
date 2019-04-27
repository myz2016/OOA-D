package com.ooad004;

import java.util.Iterator;
import java.util.List;

import com.ooad004.enums.Builder;
import com.ooad004.enums.Type;
import com.ooad004.enums.Wood;

public class FinderGuitarTester {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		List<Guitar> matchGuitars = inventory.search(whatErinLikes);
		if(!matchGuitars.isEmpty()) {
			for(Iterator<Guitar> i = matchGuitars.iterator(); i.hasNext();) {
				Guitar guitar = i.next();
				GuitarSpec spec = guitar.getGs();
				System.out.println("Erin, we have a " + spec.getBuilder() + " " + spec.getModel() + " " + spec.getType() + " guitar:\n	" + 
				spec.getBackWood() + " back and sides,\n	" +
				spec.getBackWood() + " top.\n	You can have it for only $" + 
				guitar.getPrice() + "!\n ----");
				
			}
		} else {
			System.err.println("Sorry, Erin, we have nothing for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar(null, 999, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
	}
}
