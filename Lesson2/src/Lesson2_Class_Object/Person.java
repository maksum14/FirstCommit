package Lesson2_Class_Object;

public class Person {
	// ��������� ���� �����
	String firstName;
	int age;
	double height;
	double weight;

	// ��������� ����������� � �����������
	Person(double h, double w) {
		/*
		 * � ������ ����������� ��������� ����������� ���� height , weight
		 * ����� ����� �����, �� �������� ���� �� ���������� ������ �
		 * ����������� ����� -��������, ����� h,w
		 */
		height = h;
		weight = w;
		/*
		 * ��� �������� ����� ������ ����� ���� ���������� ��������� �� �����
		 * ������ �������� �����
		 */
		System.out.println("We made person");
	}

	/*
	 * ����� ���� ���� ��� ������, ������� �� �������� � �������� ���� ��
	 * �����. ����� �� ������� �� ������� �������� � ������ ����� ����������
	 * ����� � ������������� �����������!
	 */
	double volume(String... tur) {
		double vol = height * weight;
		System.out.println(vol);
		return vol;
	}

	/* ����� ����� ���� ��� ������ � ������ ������� �� �������� */
	double volume1() {
		double vol = height * weight;
		return vol;
	}

	/*
	 * � ������ ����� �� ��������� ��������� ����� Person, ��� �������� �����
	 * fun ��� ���������� ��������� ���� ���� ���������� � ����� volume , �
	 * �������� ����� fun �� �����
	 */
	void ret() {
		Person p = new Person(5, 7);
		double fun = p.volume();
		System.out.println(fun);
	}

	
	
	
	
}
