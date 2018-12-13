package org.naglis.kls.procesai;

import java.util.Scanner;

public class PirmasMeniu {

	public int pirmasPasirinkimas() {
		
		System.out.println("Sveiki! Pasirinkite, ką norite atlikti:");
		System.out.println("Įvesti naują klientą - spauskite \"1\"");
		System.out.println("Peržiūrėti visą klientų sąrašą - spauskite \"2\"");
		System.out.println("Peržiūrėti kliento duomenis - spauskite \"3\"");
		System.out.println("Pakoreguoti kliento duomenis - spauskite \"4\"");
		
		Scanner scan = new Scanner(System.in);
		int pasirinkimas1 = scan.nextInt();
		
		return pasirinkimas1;
	}
	
}
