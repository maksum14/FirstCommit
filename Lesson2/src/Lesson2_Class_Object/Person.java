package Lesson2_Class_Object;

public class Person {
	// Створюємо поля класу
	String firstName;
	int age;
	double height;
	double weight;

	// Створюємо конструктор з параметрами
	Person(double h, double w) {
		/*
		 * В даному конструкторі проводимо ініціалізацію полів height , weight
		 * тобто даним полям, які оголошені вище ми присвоюємо введені в
		 * конструкторі обєкта -значення, тобто h,w
		 */
		height = h;
		weight = w;
		/*
		 * При створенні обєкту даного класу буде відбуватися виведення на екран
		 * стрічки виведеної нижче
		 */
		System.out.println("We made person");
	}

	/*
	 * метод який рахує обєм людини, повертає це значення і виводить його на
	 * екран. Також не забиваєм що вхідний параметр в даному методі називається
	 * масив з невизначеними параметрами!
	 */
	double volume(String... tur) {
		double vol = height * weight;
		System.out.println(vol);
		return vol;
	}

	/* Даний метод рахує обєм людини і просто повертає це значення */
	double volume1() {
		double vol = height * weight;
		return vol;
	}

	/*
	 * В даному методі ми створюємо екземпляр класу Person, далі стврюємо змінну
	 * fun якій присвоюємо результат який буде пораховано в методі volume , і
	 * виводимо змінну fun на екран
	 */
	void ret() {
		Person p = new Person(5, 7);
		double fun = p.volume();
		System.out.println(fun);
	}

	
	
	
	
}
