package org.naglis.kls.testai;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.naglis.kls.data.IData;
import org.naglis.kls.modelis.Klientas;
import org.naglis.kls.procesai.AdministravimoOperacijos;
import org.naglis.kls.procesai.PaieskosKriterijai;

public class AdministravimoOperacijosTest {

	@Test
	public void testPaieska() {

		AdministravimoOperacijos underTest = new AdministravimoOperacijos(new IData() {

			@Override
			public List<Klientas> bazesPapildymas() {
				List<Klientas> bandomasis = new ArrayList<>();

				bandomasis.add(new Klientas("v1", "p1", "V", "1985.02.04", "111", "3"));
				bandomasis.add(new Klientas("v2", "p2", "V", "1985.02.04", "111", "3"));
				return bandomasis;
			}
		});

		PaieskosKriterijai kriterijus = new PaieskosKriterijai();
		kriterijus.setaVardas(true);
		kriterijus.setVardas("v2");

		List<Klientas> rezultatas = underTest.paieskosKriterijausParinkimas(kriterijus);

		assertEquals(1, rezultatas.size());

		assertEquals("p2", rezultatas.get(0).getPavarde());

	}

}
