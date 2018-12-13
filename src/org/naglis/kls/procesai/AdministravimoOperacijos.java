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

	public List<Klientas> paieska(PaieskosKriterijai pKriterijus) {

		List<Klientas> paieskosRezultatai = new ArrayList<>();

		for (Klientas klientas : klientuBaze) {
			if (pKriterijus.isaVardas() == true) {
				metodas(paieskosRezultatai, klientas, klientas.getVardas(), pKriterijus.getVardas());
			}
			if (pKriterijus.isaPavarde() == true) {
				metodas(paieskosRezultatai, klientas, klientas.getPavarde(), pKriterijus.getPavarde());
			}
			if (pKriterijus.isaLytis() == true) {
				metodas(paieskosRezultatai, klientas, klientas.getLytis(), pKriterijus.getLytis());
			}
			if (pKriterijus.isaGimimoData() == true) {
				metodas(paieskosRezultatai, klientas, klientas.getGimimoData(), pKriterijus.getGimimoData());
			}
			if (pKriterijus.isaTelefonas() == true) {
				metodas(paieskosRezultatai, klientas, klientas.getTelefonas(), pKriterijus.getTelefonas());
			}
		}

		return paieskosRezultatai;
	}

	private void metodas(List<Klientas> paieskosRezultatai, Klientas klientas, String tekstasBazeje, String ieskomasTekstas) {
		if (tekstasBazeje.toLowerCase().contains(ieskomasTekstas.toLowerCase())) {
			paieskosRezultatai.add(klientas);
		}

	}

//	public boolean atnaujinimas(PaieskosKriterijai pKriterijus) {
//		
//		Klientas naujiDuomenys = new Klientas();
//		klientuBaze.set(2, naujiDuomenys);
//		
//		
//		return false;
//	}

}
