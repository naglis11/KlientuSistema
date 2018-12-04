import java.util.Comparator;

public class PagalPavarde implements Comparator<Klientas> {

	@Override
	public int compare(Klientas k1, Klientas k2) {
//
//		// -1... keliam i eiles virsu
//		// 0 - nekeiciam
//		// 1 ... esamas Person eina zemyn pagal sarasa
//
//		if (o2.getAge() < o1.getAge()) {
//			return -1 * ageOrder;
//		} else if (o2.getAge() > o1.getAge()) {
//			return 1 * ageOrder;
//		}

		return k1.getPavarde().compareToIgnoreCase(k2.getPavarde());
	}

}
