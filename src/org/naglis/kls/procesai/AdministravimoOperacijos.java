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

	KlientuBazeDarbine darbiniai = new KlientuBazeDarbine();

	List<Klientas> klientuBaze = darbiniai.bazesPapildymas();

	public void pridetiKlienta(Klientas naujasKlientas) {

		klientuBaze.add(naujasKlientas);

	}

	public List<Klientas> pateiktiSarasa(RikiavimasPagal rikiavimas) {

		switch (rikiavimas) {

		case pagalVarda:
			Collections.sort(klientuBaze, new PagalVarda());
			break;
			
		case pagalPavarde:
			Collections.sort(klientuBaze, new PagalPavarde());
			break;
			
		case pagalID:
			Collections.sort(klientuBaze, new PagalId());
			break;
		}

		return klientuBaze;

	}

	public List<Klientas> paieskosKriterijausParinkimas(PaieskosKriterijai pKriterijus) {

		List<Klientas> paieskosRezultatai = new ArrayList<>();

		for (Klientas klientas : klientuBaze) {
			if (pKriterijus.isaVardas() == true) {
				paieska(paieskosRezultatai, klientas, klientas.getVardas(), pKriterijus.getVardas());
			}
			if (pKriterijus.isaPavarde() == true) {
				paieska(paieskosRezultatai, klientas, klientas.getPavarde(), pKriterijus.getPavarde());
			}
			if (pKriterijus.isaLytis() == true) {
				paieska(paieskosRezultatai, klientas, klientas.getLytis(), pKriterijus.getLytis());
			}
			if (pKriterijus.isaGimimoData() == true) {
				paieska(paieskosRezultatai, klientas, klientas.getGimimoData(), pKriterijus.getGimimoData());
			}
			if (pKriterijus.isaTelefonas() == true) {
				paieska(paieskosRezultatai, klientas, klientas.getTelefonas(), pKriterijus.getTelefonas());
			}
		}

		return paieskosRezultatai;
	}

	private void paieska(List<Klientas> paieskosRezultatai, Klientas klientas, String tekstasBazeje, String ieskomasTekstas) {
		if (tekstasBazeje.toLowerCase().contains(ieskomasTekstas.toLowerCase())) {
			paieskosRezultatai.add(klientas);
		}

	}



}
