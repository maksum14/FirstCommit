package VerhovnaRada;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public final class VerhovnaRada {
	Scanner sc = new Scanner(System.in);
 	final Fractsia fra = new Fractsia();

	Map<String, Fractsia> verh = new HashMap<String, Fractsia>();

	private static VerhovnaRada instance;

 
	private VerhovnaRada() {

	}

	public static synchronized VerhovnaRada getInstance() {
		if (instance == null) {
			instance = new VerhovnaRada();
		}
		return instance;
	}

	public void addFrac() {
		System.out.println("Entry Fraction:");
		String e = sc.next();
		verh.put(e, new Fractsia());
	}

	public void removeFrac() {
		System.out.println("Entry Fraction to remove:");
		String e = sc.next();
		verh.remove(e);
		System.out.println("fraction" + e +" was removed");
	}

	public void clearAllFrac() {
		verh.clear();
		System.out.println("All fractions are clear");
	}

	public void oneFractions() {
		System.out.println("Entry name of Fraction:");
		String e = sc.next();
		if (verh.containsKey(e)) {
			Fractsia f = verh.get(e);
			f.allDeputats();
			//System.out.println(verh.get(e).toString());
		}

	}

	public void allFractions() {
		System.out.println("all Fraction:");
		for (Entry<String, Fractsia> entry : verh.entrySet()) {
			System.out.println(entry.getKey());
		}
	}

	public void addDeputToFractions() {
		System.out.println("Entry Fraction:");
		String e = sc.next();
		if (verh.containsKey(e)) {
			fra.addDeput();
			verh.put(e, fra);
		}

	}

	public void deleteDeputFromFractions() {
		System.out.println("Entry Fraction to delete dep:");
		String e = sc.next();
		if (verh.containsKey(e)) {
			Fractsia f = verh.get(e);
			f.deleteDeput();

		}
	}

	public void allHabarFrac() {
		System.out.println("Entry Fraction to see all Habarnyku:");
		String e = sc.next();
		if (verh.containsKey(e)) {
			Fractsia f = verh.get(e);
			f.allHabarnuky();
		}
	}

	public void MaxHabarFrac() {
		System.out.println("Entry Fraction to see max Habarnyk:");
		String e = sc.next();
		if (verh.containsKey(e)) {
			Fractsia f = verh.get(e);
			f.maxHabar();
			;
		}
	}

	public void allDeput() {
		System.out.println("Entry Fraction to see all deputates");
		String e = sc.next();
		if (verh.containsKey(e)) {
			Fractsia f = verh.get(e);
			f.allDeputats();

		}
	}

}

// System.out.println("Entry deput from Fraction to delete:");
// System.out.println("Entry Last Name:");
// String lastName = sc.next();
// System.out.println("Entry First Name:");
// String firstName = sc.next();
//
// Iterator it = verh.values().iterator();
// while (it.hasNext()) {
// Fractsia entry = (Fractsia) it.next();
// arr = entry.frac;
//
// Iterator<Deputate> eny = arr.iterator();
// while (eny.hasNext()) {
// Deputate di = eny.next();
//
// if (di.getLastName().equals(lastName)
// && di.getFirstName().equals(firstName)) {
// arr.remove(di);
// }
// }
// }
// }
/*
 * for (Deputate deputate : arr) { if (deputate.getLastName().equals(lastName)
 * && deputate.getFirstName().equals(firstName)) { arr.remove(deputate); } }
 */

// Iterator depit = arr.iterator();
// while (depit.hasNext()) {
// Deputate eny = (Deputate)depit.next();
// if (eny.getLastName().equals(lastName)
// && eny.getFirstName().equals(firstName)) {
// arr.remove(eny);
// }
//
// }

/*
 * for (Entry<String, Fractsia> entry : verh.entrySet()) { for (Deputate obj :
 * entry.getValue().frac) { if (obj.getLastName().equals(lastName) &&
 * obj.getFirstName().equals(firstName)) { entry.getValue().frac.remove(obj); }
 * } }
 */