package sorting;

import java.util.Comparator;

public class WeightComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		if (o1.getWeight() == o2.getWeight())
			return 0;
		else if (o1.getWeight() > o2.getWeight())
			return 1;
		else {
			return -1;
		}
	}

}
