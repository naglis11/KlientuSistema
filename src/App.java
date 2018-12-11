package org.naglis.kls.app;

import java.util.ArrayList;
import java.util.List;

import org.naglis.kls.modelis.Klientas;
import org.naglis.kls.procesai.AdministravimoOperacijos;
import org.naglis.kls.procesai.KlientuBazeDarbine;
import org.naglis.kls.procesai.PaieskosKriterijai;
import org.naglis.kls.procesai.RikiavimasPagal;

public class App {

	public static void main(String[] args) {

		KlientuBazeDarbine darbiniai = new KlientuBazeDarbine();

		List<Klientas> klientuBaze = darbiniai.bazesPapildymas();

		System.out.println(klientuBaze);

		AdministravimoOperacijos operacija = new AdministravimoOperacijos();

		System.out.println(operacija.pateiktiSarasa(RikiavimasPagal.pagalPavarde));

		PaieskosKriterijai kriterijus = new PaieskosKriterijai();

		kriterijus.setaVardas(true);
		kriterijus.setVardas("tomas");

		kriterijus.setaPavarde(true);
		kriterijus.setPavarde("Malinas");

		List<Klientas> paieskosRez = operacija.paieska(kriterijus);

		for (Klientas klientas : paieskosRez) {
			System.out.println(klientas);
		}

	}

}
