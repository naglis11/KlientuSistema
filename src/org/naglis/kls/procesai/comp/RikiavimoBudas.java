package org.naglis.kls.procesai.comp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.naglis.kls.modelis.Klientas;

public class RikiavimoBudas {

	public void rikiavimoVeiksmas (List<Klientas> k, int rangavimoBudas) {
	
	switch (rangavimoBudas) {
	
	case 1:			
		System.out.println("\nPasirinkote rikiuoti pagal ID:");
         
		Collections.sort(k, new PagalId());
        for (int i=0; i<k.size(); i++) 
            System.out.println(k.get(i)); 
		
		break;
	case 2:
		System.out.println("\nPasirinkote rikiuoti pagal vardą:");
         
		Collections.sort(k, new PagalVarda());
        for (int i=0; i<k.size(); i++) 
            System.out.println(k.get(i)); 
        
		break;
	case 3:
		System.out.println("\nPasirinkote rikiuoti pagal pavardę:");

		Collections.sort(k, new PagalPavarde());
        for (int i=0; i<k.size(); i++) 
            System.out.println(k.get(i));
        
		break;
	case 4:
		System.out.println("\n4 - funkcija kuriama");
		break;
	
	default:
		System.out.println("Nepasirinkote rikiavimo būdo");
		System.out.println("Sąrašas: " + Arrays.toString(k.toArray())); //spausdina sarasa toki, koks ivestas
	}
	
	}
}
