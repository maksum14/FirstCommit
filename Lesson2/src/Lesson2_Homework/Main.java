package Lesson2_Homework;

public class Main {

	public static void main(String[] args) {
		//
		// Rectangle rectangle=new Rectangle();
		// Rectangle rectangle2=new Rectangle(15,15);
		//
		// rectangle.squire();
		// rectangle.perimeter();
		//
		// rectangle2.squire();
		// rectangle2.perimeter();

		/*
		 * Створіть масив з 15 випадкових цілих чисел(тобто використовуємо
		 * Math.random або random.NextInt()) з відрізка [0; 9]. Виведіть масив
		 * на екран. Підрахуйте скільки в масиві парних елементів і виведете цю
		 * кількість на екран на окремому рядку. Провести сортування даного
		 * масиву від найменшого до найбільшого-зліва направо результат вивести
		 * на екран в один рядок, між цифрами реалізувати відступ щоб вони не
		 * зліпались докупи при виводі. І провести сортування від найбільшого до
		 * найменшого -зліва направо результат вивести на екран в один рядок,
		 * між цифрами реалізувати відступ щоб вони не зліпались докупи при
		 * виводі.
		 */
		// Заповнюємо випадковими елементами масив
		int mas[] = new int[15];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) Math.round(Math.random() * 9);
		}
		
		System.out.println("Масив несортований : ");
		// Вивовдимо даний масив на екран
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		// створюємо змінну яка буде рахувати кількість парних елементів
		int countPair = 0;
		// Запускаємо лічильник для перебору всіх елементів масиву
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				countPair++;
			}
		}
		// Сортуємо масив від найменшого до найбільшого
		for (int i = 0; i < mas.length; i++) {
			for (int j = i + 1; j < mas.length; j++) {
				//Насправді умова дуже проста , якщо наступний елемент масиву є меншим за перший елемент, поміняти їх місцями
				if (mas[i] > mas[j]) {
					int temp = mas[i];
					mas[i] = mas[j];
					mas[j] = temp;
				}

			}

		}
		System.out.println();
		//Пишемо цикл для виведення елементів на екран
		System.out.println("Відсортований масив від найменшого до найбільшого: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i]+" ");
		}
		
		System.out.println();
		//Проводимо сортування 
		System.out.println("Відсортований масив від найбільшого до найменшого: ");
			for (int i = 0; i < mas.length; i++) {
			for (int j = i + 1; j < mas.length; j++) {
				if (mas[i] < mas[j]) {
					int temp = mas[i];
					mas[i] = mas[j];
					mas[j] = temp;
				}

			}

		}
	//Виводимо масив на екран
			for (int i = 0; i < mas.length; i++) {
				System.out.print(mas[i]+" ");
			}
		
		
	
			
			
			
			
			
			
			
	}
}
