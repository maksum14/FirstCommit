package VerhovnaRada;

import java.awt.Menu;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void menu(int a) {
		Fractsia fr = new Fractsia();

		switch (a) {
		case 1: {
			VerhovnaRada.getInstance().addFrac();
			break;
		}
		case 2: {
			VerhovnaRada.getInstance().removeFrac();
			break;
		}
		case 3: {
			VerhovnaRada.getInstance().clearAllFrac();
			break;
		}
		case 4: {
			VerhovnaRada.getInstance().allFractions();
			break;
		}
		case 5: {
			VerhovnaRada.getInstance().oneFractions();
			break;
		}
		case 6: {
			VerhovnaRada.getInstance().addDeputToFractions();
			break;
		}
		case 7: {
			VerhovnaRada.getInstance().deleteDeputFromFractions();
			break;
		}
		case 8: {
			VerhovnaRada.getInstance().allHabarFrac();
			break;
		}
		case 9: {
			VerhovnaRada.getInstance().MaxHabarFrac();
			break;
		}
		case 10: {
			System.exit(10);

		}
		}
	}

	public static void main(String[] args) {

		System.out.println("Welcom to VR");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("to do enter number from [1-9]\n"
					+ "1 - ������ ������� \n" + "2 -  �������� ������� \n"
					+ "3 -  �������� ������ \n" + "4 - ������� �� �������\n"
					+ "5 -  ������� ��������� �������\n"
					+ "6 - ������ �������� �� ��������� �������\n"
					+ "7  - �������� �������� � ���곿\n"
					+ "8 - ������� ��� ��������� �������\n"
					+ "9 - ������� ���������� ���������\n"
					+  "10 - ����� � ����");

			int number = sc.nextInt();
			menu(number);
		}
	}
}
// Fractsia fr = new Fractsia();
// fr.addDeput();s
// fr.addDeput();
// fr.addDeput();
// System.out.println(fr.frac);
//
// fr.deleteDeput();
// System.out.println(fr.frac);
//
// fr.allHabarnuky();
// fr.maxHabar();
// fr.allDeputats();
// fr.deleteAllDeputats();

// VerhovnaRada.getInstance().addFrac();
// VerhovnaRada.getInstance().addFrac();
// VerhovnaRada.getInstance().addFrac();
// VerhovnaRada.getInstance().removeFrac();
// VerhovnaRada.getInstance().allFractions();
// VerhovnaRada.getInstance().addDeputToFractions();
// VerhovnaRada.getInstance().addDeputToFractions();
// VerhovnaRada.getInstance().oneFractions();
// VerhovnaRada.getInstance().deleteDeputFromFractions();
// VerhovnaRada.getInstance().oneFractions();

