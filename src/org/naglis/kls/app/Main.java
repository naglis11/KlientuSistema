package org.naglis.kls.app;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.naglis.kls.modelis.Klientas;
import org.naglis.kls.procesai.KlientuBazeDarbine;
import org.naglis.kls.procesai.PirmasMeniu;
import org.naglis.kls.procesai.PirmasVeiksmas;
import org.naglis.kls.procesai.comp.RikiavimoMeniu;
import org.naglis.kls.procesai.comp.PagalId;
import org.naglis.kls.procesai.comp.PagalPavarde;
import org.naglis.kls.procesai.comp.PagalVarda;
import org.naglis.kls.procesai.comp.RikiavimoBudas;

public class Main {

//	public static void main(String[] args) {

		
		PirmasMeniu pasirinkimas1 = new PirmasMeniu();
		
		int pasirinkimas = pasirinkimas1.pirmasPasirinkimas();
		
		PirmasVeiksmas rm = new PirmasVeiksmas();
		
		
				
		
		List<Klientas> klientai = new ArrayList<>();
		
		RikiavimoBudas rb = new RikiavimoBudas();
		
//		rb.rikiavimoVeiksmas(klientai, rikiavimoBudas);
		
//		
//		switch (rangavimoBudas) {
//		
//		case 1:			
//			System.out.println("\nPasirinkote rikiuoti pagal ID:");
//	         
//			Collections.sort(k, new PagalId());
//	        for (int i=0; i<k.size(); i++) 
//	            System.out.println(k.get(i)); 
//			
//			break;
//		case 2:
//			System.out.println("\nPasirinkote rikiuoti pagal vardą:");
//	         
//			Collections.sort(k, new PagalVarda());
//	        for (int i=0; i<k.size(); i++) 
//	            System.out.println(k.get(i)); 
//	        
//			break;
//		case 3:
//			System.out.println("\nPasirinkote rikiuoti pagal pavardę:");
//
//			Collections.sort(k, new PagalPavarde());
//	        for (int i=0; i<k.size(); i++) 
//	            System.out.println(k.get(i));
//	        
//			break;
//		case 4:
//			System.out.println("\n4 - funkcija kuriama");
//			break;
//		
//		default:
//			System.out.println("Nepasirinkote rikiavimo būdo");
//			System.out.println("Sąrašas: " + Arrays.toString(k.toArray())); //spausdina sarasa toki, koks ivestas
//		}
//		
//		
		
	        
	}

}
