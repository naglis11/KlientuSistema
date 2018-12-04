import java.util.Comparator;

public class PagalVarda implements Comparator<Klientas> {

	@Override
	public int compare(Klientas k1, Klientas k2) {

		
		return k1.getVardas().compareToIgnoreCase(k2.getVardas());
	}

}
