package com.ooad006;

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
	private List<Instrument> instruments;
	public Inventory() {
		instruments = new LinkedList<Instrument>();
	}
	public void addInstrument(String serialNumber, double price, InstrumentSpec is) {
		Instrument instrument = null;
		if(is instanceof GuitarSpec) {
			instrument = new Guitar(serialNumber, (GuitarSpec)is, price);
		} else if (is instanceof MandolinSpec) {
			instrument = new Mandolin(serialNumber, price, (MandolinSpec)is);
		}
		this.instruments.add(instrument);
	}
	
	public Instrument get(String serialNumber) {
		for(Iterator<Instrument> i = this.instruments.iterator(); i.hasNext();) {
			Instrument instrument = i.next();
			if(instrument.getSerialNumber().equals(serialNumber)) {
				return instrument;
			}
		}
		return null;
	}
	public List<Guitar> search(GuitarSpec searchGuitar) {
		List<Guitar> matchGuitars = new LinkedList<Guitar>();
		for(Iterator<Instrument> i = this.instruments.iterator(); i.hasNext();) {
			if(i.next() instanceof Guitar) {
				Guitar guitar = (Guitar)i.next();
				if((guitar.getInstrumentSpec()).matches(searchGuitar)) {
					matchGuitars.add(guitar);
				}
			}
		}
		return matchGuitars;
	}
	public List<Mandolin> search(MandolinSpec searchMandolin) {
		List<Mandolin> mandolins = new LinkedList<Mandolin>();
		for (Iterator<Instrument> i = this.instruments.iterator(); i.hasNext();) {
			if(i.next() instanceof Mandolin) {
				Mandolin guitar = (Mandolin)i.next();
				if((guitar.getInstrumentSpec()).matches(searchMandolin)) {
					mandolins.add(guitar);
				}
			}			
		}
		return mandolins;
	}
}
