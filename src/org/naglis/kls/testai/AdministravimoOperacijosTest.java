package org.naglis.kls.testai;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.naglis.kls.modelis.Klientas;
import org.naglis.kls.procesai.AdministravimoOperacijos;
import org.naglis.kls.procesai.PaieskosKriterijai;

public class AdministravimoOperacijosTest {

	@Test
	public void testPaieska() {
		
		AdministravimoOperacijos underTest = new AdministravimoOperacijos();

		List<Klientas> bandomasis = new ArrayList<>();
		
		bandomasis.add(new Klientas("Tomas", "Malinauskas", "V", "1985.02.04", "86000000", "3"));
		
		PaieskosKriterijai kriterijus = new PaieskosKriterijai();
		kriterijus.setaVardas(true);
		kriterijus.setVardas("Tomas");
		
		List<Klientas> rezultatas = underTest.paieskosKriterijausParinkimas(kriterijus);
		
		boolean arLygu = false;
		arLygu = bandomasis.equals(rezultatas);
		
		assertEquals(arLygu, true);
				
	}
	
}
