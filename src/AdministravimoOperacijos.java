package org.naglis.kls.procesai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.naglis.kls.modelis.Klientas;
import org.naglis.kls.procesai.comp.PagalId;
import org.naglis.kls.procesai.comp.PagalPavarde;
import org.naglis.kls.procesai.comp.PagalVarda;

public class AdministravimoOperacijos {

	List<Klientas> klientuBaze = new ArrayList<>();
	
	public void pridetiKlienta(Klientas naujasKlientas) {

		klientuBaze.add(naujasKlientas);

	}

	public List<Klientas> pateiktiSarasa(RikiavimasPagal rikiavimas) {

		List<Klientas> rikiuojamaBaze = klientuBaze;

		switch (rikiavimas) {

		case pagalVarda:

			Collections.sort(rikiuojamaBaze, new PagalVarda());
			for (int i = 0; i < rikiuojamaBaze.size(); i++) {
			rikiuojamaBaze.get(i);
			break;
			}
			
		case pagalPavarde:

			Collections.sort(rikiuojamaBaze, new PagalId());
			for (int i = 0; i < rikiuojamaBaze.size(); i++) {
			rikiuojamaBaze.get(i);
			break;
			}
			
		case pagalID:

			Collections.sort(rikiuojamaBaze, new PagalPavarde());
			for (int i = 0; i < rikiuojamaBaze.size(); i++) {
			rikiuojamaBaze.get(i);
			break;
			}
		}

		return rikiuojamaBaze;

	}

	public List<Klientas> paieska(PaieskosKriterijai pKriterijus, String pZodis) {
		
		List<Klientas> paieskosRezultatai = new ArrayList<>();
		if (pKriterijus.isaVardas() == true) {
			
			for (Klientas klientas : klientuBaze) {
				if (klientas.getVardas().toLowerCase().contains(pZodis.toLowerCase())) {
					paieskosRezultatai.add(klientas);
				}
			} 
		}
		
		if (pKriterijus.isaPavarde() == true) {
			
			for (Klientas klientas : klientuBaze) {
				if (klientas.getPavarde().toLowerCase().contains(pZodis.toLowerCase())) {
					paieskosRezultatai.add(klientas);
				}
			} 
		}
		
		if (pKriterijus.isaLytis() == true) {
			
			for (Klientas klientas : klientuBaze) {
				if (klientas.getLytis().toLowerCase().contains(pZodis.toLowerCase())) {
					paieskosRezultatai.add(klientas);
				}
			} 
		}
		
		if (pKriterijus.isaGimimoData() == true) {
			
			for (Klientas klientas : klientuBaze) {
				if (klientas.getGimimoData().toLowerCase().contains(pZodis.toLowerCase())) {
					paieskosRezultatai.add(klientas);
				}
			} 
		}
		
		if (pKriterijus.isaTelefonas() == true) {
			
			for (Klientas klientas : klientuBaze) {
				if (klientas.getTelefonas().toLowerCase().contains(pZodis.toLowerCase())) {
					paieskosRezultatai.add(klientas);
				}
			} 
		}
		return paieskosRezultatai;
	}

	public boolean atnaujinimas(PaieskosKriterijai pKriterijus) {

		return false;
	}

}
