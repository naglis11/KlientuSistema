package org.naglis.kls.procesai.comp;
import java.util.Comparator;

import org.naglis.kls.modelis.Klientas;

public class PagalPavarde implements Comparator<Klientas> {

	@Override
	public int compare(Klientas k1, Klientas k2) {
		
		return k1.getPavarde().compareToIgnoreCase(k2.getPavarde());
		
		
	}

}
