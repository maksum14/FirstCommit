package MathTest;

/**
 * The Test1 program implements an application that simply check if number
 * contains "3" and do reverse order of number
 * 
 * @author Maksym Hirnyak
 * @version 1.0
 */

public class Task1 {

	final char THREE = '3'; // constant

	/**
	 * Method search generate if number include "3"
	 * @param number first number
	 */
	public void search(int number) {
		String s = String.valueOf(number * number);
		char[] chars = s.toCharArray();
		for (char c : chars) {
			if (c == THREE) {
				System.out.println(number + " in square contains 3");

			}
		}

	}

	/**
	 * Method reverseOrder obtain number to reverse order
	 * use loops for searching
	 * @param number first numbers
	 * @return newChars array of chars
	 */
	public char[] reverseOrder(int number) {
		String s = String.valueOf(number);
		char[] chars = s.toCharArray();
		char[] newChars = new char[chars.length + 1];
		int j = 0;
		for (int i = chars.length; i > 0; i--) {
			newChars[i] = chars[j++];
		}
		System.out.println(newChars);
		return newChars;
	}

	/**
	 * Method reverseOrder obtain number to reverse order
	 * use StringBuilder for use
	 * @param number first number
	 * @return String reversed numbers
	 */
	public int reverseOrder2(int number) {
		String s = String.valueOf(number);
		String reversed = new StringBuilder(s).reverse().toString();
		System.out.println("reversed order " + reversed);
		int myInt =Integer.parseInt(reversed);
		return myInt;
	}

	 
	 
}
