package inputoutput.ue.inout;

import java.util.Comparator;

public class comparePerson implements Comparator<bsp3Person> {

	@Override
	public int compare(bsp3Person o1, bsp3Person o2) {
			return o1.getNachname().compareTo(o2.getNachname());
		}


}
