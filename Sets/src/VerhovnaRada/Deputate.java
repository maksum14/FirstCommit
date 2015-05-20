package VerhovnaRada;

import java.util.Scanner;

public class Deputate extends Person {
	private String firstName;
	private String lastName;
	private int age;
	private boolean bribeTaker;
	private int briber;

	public Deputate(double weight, double height, String firstName,
			String lastName, int age, boolean bribeTaker) {
		super(weight, height);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.bribeTaker = bribeTaker;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBribeTaker() {
		return bribeTaker;
	}

	public void setBribeTaker(boolean bribeTaker) {
		this.bribeTaker = bribeTaker;
	}

	@Override
	public String toString() {
		return "FirstName = " + firstName + " LastName = " + lastName
				+ " Age = " + age + " BribeTaker = " + bribeTaker
				+ super.toString();
	}

	public void takeBriber() {
		if (!bribeTaker) {
			System.out.println("Цей депутат не бере хабарів.");
		} else {
			System.out.println("Введіть суму хабаря");
			Scanner sc = new Scanner(System.in);
			int briber = sc.nextInt();
			if (briber > 5000) {
				System.out.println("Миліція заарештує депутата");
				this.briber = briber;
			} else {
				if (briber > 0) {
					this.briber = briber;
				} else {
					System.out.println("Хабарники не віддають грошей");
				}

			}
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + (bribeTaker ? 1231 : 1237);
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deputate other = (Deputate) obj;
		if (age != other.age)
			return false;
		if (bribeTaker != other.bribeTaker)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	public int getBriber() {
		return briber;
	}

	public void setBriber(int briber) {
		this.briber = briber;
	}

}
