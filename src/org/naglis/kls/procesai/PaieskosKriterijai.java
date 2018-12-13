package org.naglis.kls.procesai;

import org.naglis.kls.modelis.Klientas;

public class PaieskosKriterijai extends Klientas {

	// vardas
	private boolean aVardas;

	// pavarde
	private boolean aPavarde;

	// lytis
	private boolean aLytis;

	// gimimo data
	private boolean aGimimoData;

	// telefono numeris
	private boolean aTelefonas;

	public boolean isaVardas() {
		return aVardas;
	}

	public void setaVardas(boolean aVardas) {
		this.aVardas = aVardas;
	}

	public boolean isaPavarde() {
		return aPavarde;
	}

	public void setaPavarde(boolean aPavarde) {
		this.aPavarde = aPavarde;
	}

	public boolean isaLytis() {
		return aLytis;
	}

	public void setaLytis(boolean aLytis) {
		this.aLytis = aLytis;
	}

	public boolean isaGimimoData() {
		return aGimimoData;
	}

	public void setaGimimoData(boolean aGimimoData) {
		this.aGimimoData = aGimimoData;
	}

	public boolean isaTelefonas() {
		return aTelefonas;
	}

	public void setaTelefonas(boolean aTelefonas) {
		this.aTelefonas = aTelefonas;
	}

}
