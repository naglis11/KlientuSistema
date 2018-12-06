import java.util.Comparator;

public class PagalPavarde implements Comparator<Klientas> {

	@Override
	public int compare(Klientas k1, Klientas k2) {
		
		return k1.getPavarde().compareToIgnoreCase(k2.getPavarde());
		
		
	}

}
