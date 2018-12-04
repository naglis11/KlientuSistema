
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
	private char lytis;

	// gimimo data
	private String gimimoData;

	// telefono numeris
	private String telefonas;

	// unikalus id
	private String id;

	// klases construktorius
	Klientas(String vardas, String pavarde, char lytis, String gimimoData, String telefonas, String id) {
		this.vardas = vardas;
		this.pavarde = pavarde;
		this.lytis = lytis;
		this.gimimoData = gimimoData;
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

	public char getLytis() {
		return lytis;
	}

	public void setLytis(char lytis) {
		this.lytis = lytis;
	}

	public String getGimimoData() {
		return gimimoData;
	}

	public void setGimimoData(String gimimoData) {
		this.gimimoData = gimimoData;
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
		return vardas + " " + pavarde + " (" + lytis + ") " + gimimoData + " Tel:" + telefonas + " ID:" + id;
	}

	// info apie klienta isspausdinimas
	public void klientoInfo(String vardas, String pavarde, char lytis, String gimimoData, String telefonas, String id) {

		System.out.println(vardas + " " + pavarde + " " + lytis + " " + gimimoData + " " + telefonas + " " + id);

	}

}
