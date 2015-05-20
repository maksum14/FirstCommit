package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// ArrayList list =new ArrayList();
		//
		// list.add(new Person("Vitalik", 100,190));
		// list.add(new Person("Vitalik", 110,10));
		// list.add(new Person("Vitalik", 110,12));
		// list.add(new Person("Pulup", 21,210));
		// list.add(new Person("Andrew", 34,175));
		// list.add(new Person("Josh", 123,12));
		// list.add(new Person("Hula", 92,45));
		//
		// System.out.println("Before sorting :");
		// for (Object o : list) {
		// System.out.println(o);
		// }
		// System.out.println();
		//
		// System.out.println("After sortinng :");
		// Collections.sort(list);
		// System.out.println();
		//
		// for (Object o : list) {
		// System.out.println(o);
		// }

		ArrayList<Person> list = new ArrayList<Person>();
		System.out.println("Before");
		list.add(new Person("Vitalik", 100, 190));
		list.add(new Person("Vitalik", 110, 12));
		list.add(new Person("Vitalik", 110, 10));
		list.add(new Person("Pulup", 21, 210));
		list.add(new Person("Andrew", 34, 175));
		list.add(new Person("Josh", 123, 12));
		list.add(new Person("Hula", 92, 45));

		for (Object o : list) {
			System.out.println(o);
		}

		//Collections.sort(list);

		System.out.println("After");
		 Collections.sort(list, new NameComparator());
		// System.out.println("After" + "\n");
		for (Object o : list) {
			System.out.println(o);
		}

	}
}
