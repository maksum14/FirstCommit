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
		 * ������� ����� � 15 ���������� ����� �����(����� �������������
		 * Math.random ��� random.NextInt()) � ������ [0; 9]. ������� �����
		 * �� �����. ϳ�������� ������ � ����� ������ �������� � �������� ��
		 * ������� �� ����� �� �������� �����. �������� ���������� ������
		 * ������ �� ���������� �� ����������-���� ������� ��������� �������
		 * �� ����� � ���� �����, �� ������� ���������� ������ ��� ���� ��
		 * �������� ������ ��� �����. � �������� ���������� �� ���������� ��
		 * ���������� -���� ������� ��������� ������� �� ����� � ���� �����,
		 * �� ������� ���������� ������ ��� ���� �� �������� ������ ���
		 * �����.
		 */
		// ���������� ����������� ���������� �����
		int mas[] = new int[15];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) Math.round(Math.random() * 9);
		}
		
		System.out.println("����� ������������ : ");
		// ��������� ����� ����� �� �����
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		// ��������� ����� ��� ���� �������� ������� ������ ��������
		int countPair = 0;
		// ��������� �������� ��� �������� ��� �������� ������
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				countPair++;
			}
		}
		// ������� ����� �� ���������� �� ����������
		for (int i = 0; i < mas.length; i++) {
			for (int j = i + 1; j < mas.length; j++) {
				//�������� ����� ���� ������ , ���� ��������� ������� ������ � ������ �� ������ �������, ������� �� ������
				if (mas[i] > mas[j]) {
					int temp = mas[i];
					mas[i] = mas[j];
					mas[j] = temp;
				}

			}

		}
		System.out.println();
		//������ ���� ��� ��������� �������� �� �����
		System.out.println("³����������� ����� �� ���������� �� ����������: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i]+" ");
		}
		
		System.out.println();
		//��������� ���������� 
		System.out.println("³����������� ����� �� ���������� �� ����������: ");
			for (int i = 0; i < mas.length; i++) {
			for (int j = i + 1; j < mas.length; j++) {
				if (mas[i] < mas[j]) {
					int temp = mas[i];
					mas[i] = mas[j];
					mas[j] = temp;
				}

			}

		}
	//�������� ����� �� �����
			for (int i = 0; i < mas.length; i++) {
				System.out.print(mas[i]+" ");
			}
		
		
	
			
			
			
			
			
			
			
	}
}
