import java.util.Comparator;

public class PagalId implements Comparator<Klientas> {

	@Override
	public int compare(Klientas k1, Klientas k2) {

		
		return k1.getId().compareToIgnoreCase(k2.getId());
	}

}
