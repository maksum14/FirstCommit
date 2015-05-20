package VerhovnaRada;

import java.util.*;

public class Fractsia implements Iterable<Deputate> {
	Scanner sc = new Scanner(System.in);
	List<Deputate> frac = new ArrayList<Deputate>();
	Set<Deputate> habarFrac = new HashSet<Deputate>();

	Deputate d;

	@Override
	public String toString() throws NullPointerException {
		return "Fractsia include:  [Deputats=" + d.toString() + "]";
	}

	public void addDeput() {
		System.out.println("Entry deputate characters :");
		System.out.println("Entry weight");
		double w = sc.nextDouble();
		System.out.println("Entry height");
		double h = sc.nextDouble();
		System.out.println("Entry FirstName");
		String firstname = sc.next();
		System.out.println("Entry LastName");
		String lastname = sc.next();
		System.out.println("Entry full age");
		int age = sc.nextInt();

		System.out.println("Entry is habarnuk?  true/false");
		boolean brib = sc.nextBoolean();
		d = new Deputate(w, h, firstname, lastname, age, brib);
		frac.add(d);
		d.takeBriber();

	}

	public void deleteDeput() {
		if (frac.isEmpty())
			return;

		Iterator<Deputate> ite = frac.iterator();

		System.out.println("delete a deputate");
		System.out.println("Entry FirstName");
		String firstName = sc.next();
		System.out.println("Entry LastName");
		String lastName = sc.next();
		System.out.println("Good By " + firstName + " " + lastName);

		Set<Deputate> depToDel = new HashSet<Deputate>();

		while (ite.hasNext()) {
			Deputate obj = ite.next();
			if (obj.getFirstName().equals(firstName)
					&& obj.getLastName().equals(lastName)) {
				depToDel.add(obj);

			}
		}

		frac.removeAll(depToDel);

	}

	public void allHabarnuky() {
		for (Deputate obj : frac) {
			if (obj.isBribeTaker()) {
				habarFrac.add(obj);
			}
		}
		for (Deputate deputate : habarFrac) {
			System.out.println(deputate);
		}
	}

	public void maxHabar() {
		int maxHabar = 0;
		for (Deputate deputate : habarFrac) {
			if (deputate.getBriber() > maxHabar) {
				maxHabar = deputate.getBriber();
			}
		}

		for (Deputate deputate : habarFrac) {
			if (deputate.getBriber() == maxHabar) {
				System.out.println("Max Habarnuk is");
				System.out.println(deputate);
			}
		}

	}

	public Fractsia() {
		d = new Deputate(0, 0, null, null, 0, false);
	}

	public void allDeputats() {
		System.out.println("All deputats :");
		for (Deputate deputate : frac) {
			System.out.println(deputate);
		}

	}

	public void deleteAllDeputats() {
		frac.clear();
		System.out.println("no deputtas in fraction" + frac);
	}

	@Override
	public Iterator<Deputate> iterator() {
		return frac.iterator();
	}
}
