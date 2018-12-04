import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Klientas> k = new ArrayList<>();
		
		
		k.add(new Klientas("Rūta", "Norkutė", 'M', "1998.01.03", "869999999", "9999"));
		k.add(new Klientas("Tomas", "Malinauskas", 'V', "1985.02.04", "86000000", "9998"));
		k.add(new Klientas("Lina", "Kazlauskienė", 'M', "1967.04.06", "86888888", "302"));

		System.out.println("Sąrašas: " + Arrays.toString(k.toArray())); //spausdina sarasa toki, koks ivestas
		
		//spausdina sarasa, surikiuota pagal pavarde
		
		System.out.println("\n" + "Pagal pavardę:");

		Collections.sort(k, new PagalPavarde());
        for (int i=0; i<k.size(); i++) 
            System.out.println(k.get(i)); 
		
		//spausdina sarasa, surikiuota pagal varda

		System.out.println("\n" + "Pagal vardą:");
         
		Collections.sort(k, new PagalVarda());
        for (int i=0; i<k.size(); i++) 
            System.out.println(k.get(i)); 
		
         //spausdina sarasa, surikiuota pagal ID

		System.out.println("\n" + "Pagal ID:");
         
		Collections.sort(k, new PagalId());
        for (int i=0; i<k.size(); i++) 
            System.out.println(k.get(i)); 
        
	}

}
