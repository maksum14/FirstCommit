package Lesson2_Class_Object;

import Lesson2_Class_Object.Person;

public class Main {

	public static void main(String... dshfshdgfhsdg) {
		/*Створюємо обєкт класу Person, присвоюємо йому значення 2 і 3*/
		Person person=new Person(2,3);
		/*Викликаємо метод ret() де вже відбулась створення та ініціалізація іншого обєкта класу Person
		 тому на екран виводить не 6 , а 35 , бо ми описали в методі що обєкт р класу person має поля 
		 7 та 5 */
		person.ret();
		
		
		
	int i=0;
	i++;
	System.out.println(i);
	i=i++;
	System.out.println(i);
	System.out.println(i);	
	}
	
	
	
	
	
}
