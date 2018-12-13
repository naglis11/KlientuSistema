package org.naglis.kls.procesai;

import org.naglis.kls.procesai.comp.RikiavimoMeniu;

public class PirmasVeiksmas {

	public void pirmasPasirinkimas(int pasirinkimas) {
		
		switch (pasirinkimas) {
		
		case 1:			
			System.out.println("1 - funkcija kuriama");
			break;
		case 2:
			RikiavimoMeniu antrasPasirinkimas = new RikiavimoMeniu();
			int rangavimoBudas = antrasPasirinkimas.pagalKaRikiuoti();
			break;
		case 3:
			System.out.println("3 - funkcija kuriama");
			break;
		case 4:
			System.out.println("4 - funkcija kuriama");
			break;
		default:
			System.out.println("Įveskite skaičių nuo 1 iki 4");
			
		}
		
		
	}

}
