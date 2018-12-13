package org.naglis.kls.procesai.comp;

import java.util.Scanner;

public class RikiavimoMeniu {

	public int pagalKaRikiuoti() {
		
		System.out.println("\nPasirinkite duomenų rikiavimo kriterijų:");
		System.out.println("Kliento ID - spauskite \"1\"");
		System.out.println("Kliento vardas - spauskite \"2\"");
		System.out.println("Kliento pavardė - spauskite \"3\"");
		System.out.println("Kliento turimo abonimento galiojimas - spauskite \"4\"");	
		
		Scanner scan2 = new Scanner(System.in);
		int rikiavimoBudas = scan2.nextInt();
		
		return rikiavimoBudas;
	}
	
}
