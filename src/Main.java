import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		List<Klientas> k = new ArrayList<>();
		
		k.add(new Klientas("Rūta", "Norkutė", 'M', "1998.01.03", "869999999", "9999"));
		k.add(new Klientas("Tomas", "Malinauskas", 'V', "1985.02.04", "86000000", "9998"));
		k.add(new Klientas("Lina", "Kazlauskienė", 'M', "1967.04.06", "86888888", "302"));

		System.out.println("Sveiki! Pasirinkite, ką norite atlikti:");
		System.out.println("Įvesti naują klientą - spauskite \"1\"");
		System.out.println("Peržiūrėti visą klientų sąrašą - spauskite \"2\"");
		System.out.println("Peržiūrėti kliento duomenis - spauskite \"3\"");
		System.out.println("Pakoreguoti kliento duomenis - spauskite \"4\"");
		
		Scanner scan = new Scanner(System.in);
		int pasirinkimas = scan.nextInt();
		
		switch (pasirinkimas) {
		
		case 1:			
			System.out.println("1 - funkcija kuriama");
			break;
		case 2:
			
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
		
		System.out.println("Pasirinkite duomenų rikiavimo kriterijų:");
		System.out.println("Kliento ID - spauskite \"1\"");
		System.out.println("Kliento vardas - spauskite \"2\"");
		System.out.println("Kliento pavardė - spauskite \"3\"");
		System.out.println("Kliento turimo abonimento galiojimas - spauskite \"4\"");	
		
		Scanner scan2 = new Scanner(System.in);
		int rangavimoBudas = scan2.nextInt();
		
		switch (rangavimoBudas) {
		
		case 1:			
			System.out.println("\n" + "Pasirinkote rikiuoti pagal ID:");
	         
			Collections.sort(k, new PagalId());
	        for (int i=0; i<k.size(); i++) 
	            System.out.println(k.get(i)); 
			
			break;
		case 2:
			System.out.println("\n" + "Pasirinkote rikiuoti pagal vardą:");
	         
			Collections.sort(k, new PagalVarda());
	        for (int i=0; i<k.size(); i++) 
	            System.out.println(k.get(i)); 
	        
			break;
		case 3:
			System.out.println("\n" + "Pasirinkote rikiuoti pagal pavardę:");

			Collections.sort(k, new PagalPavarde());
	        for (int i=0; i<k.size(); i++) 
	            System.out.println(k.get(i));
	        
			break;
		case 4:
			System.out.println("4 - funkcija kuriama");
			break;
		
		default:
			System.out.println("Nepasirinkote rikiavimo būdo");
			System.out.println("Sąrašas: " + Arrays.toString(k.toArray())); //spausdina sarasa toki, koks ivestas
		}
		
		
		
	        
	}

}
