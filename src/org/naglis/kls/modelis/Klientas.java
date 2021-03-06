package org.naglis.kls.modelis;

public class Klientas {

	// kad pasitikrintum, ar klase veikia, pasidarome cia pradzioje public static
	// void main ir sumetam kokius nors duomenis tikrinimui:
	// public static void main(String args) {
	// new Klientas().metodas(x);}

	// vardas
	private String vardas;

	// pavarde
	private String pavarde;

	// lytis
	private String lytis;

	// gimimo data
	//fixme
	private String gimimoMetai;

	// telefono numeris
	private String telefonas;

	// unikalus id
	private String id;

	// klases construktorius
	public Klientas() {
	}
	
	public Klientas(String vardas, String pavarde, String lytis, String gimimoMetai, String telefonas, String id) {
		this.vardas = vardas;
		this.pavarde = pavarde;
		this.lytis = lytis;
		this.gimimoMetai = gimimoMetai;
		this.telefonas = telefonas;
		this.id = id;
	}

	public String getVardas() {
		return vardas;
	}

	public void setVardas(String vardas) {
		this.vardas = vardas;
	}

	public String getPavarde() {
		return pavarde;
	}

	public void setPavarde(String pavarde) {
		this.pavarde = pavarde;
	}

	public String getLytis() {
		return lytis;
	}

	public void setLytis(String lytis) {
		this.lytis = lytis;
	}

	public String getGimimoData() {
		return gimimoMetai;
	}

	public void setGimimoData(String gimimoData) {
		this.gimimoMetai = gimimoData;
	}

	public String getTelefonas() {
		return telefonas;
	}

	public void setTelefonas(String telefonas) {
		this.telefonas = telefonas;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return vardas + " " + pavarde + " (" + lytis + ") " + gimimoMetai + " Tel:" + telefonas + " ID:" + id;
	}

	// info apie klienta isspausdinimas
	public void klientoInfo(String vardas, String pavarde, String lytis, String gimimoData, String telefonas, String id) {

		System.out.println(vardas + " " + pavarde + " " + lytis + " " + gimimoData + " " + telefonas + " " + id);

	}

}
