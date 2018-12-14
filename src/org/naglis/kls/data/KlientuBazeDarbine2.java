package org.naglis.kls.data;

import java.util.ArrayList;
import java.util.List;

import org.naglis.kls.modelis.Klientas;

public class KlientuBazeDarbine2 implements IData {

	public List<Klientas> bazesPapildymas() {
	
		List<Klientas> klientuBaze = new ArrayList<>();
		
		klientuBaze.add(new Klientas("Rūta2", "Norkutė", "M", "1998.01.03", "869999999", "1"));
		klientuBaze.add(new Klientas("Tomas2", "Malinauskas", "V", "1985.02.04", "86000000", "3"));
		klientuBaze.add(new Klientas("Lina2", "Kazlauskienė", "M", "1967.04.06", "86888888", "2"));
		
		return klientuBaze;
	}
	

	
}
