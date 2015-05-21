package MathTest;
/**
 *  The Test1 program excecute an application that simply check if number
 * contains "3" and do reverse order of number
 * 
 * @author Maksym Hirnyak
 * @version 1.0
 */
import java.util.Scanner;

public class TestMain {
	/**
	 * This is main method which makes use search and reverseOrder2 methods
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Task1 test1 = new Task1();
		System.out.println("Input number to check if it contain '3'");
		int number = scan.nextInt();
		test1.search(number);
		System.out.println("Input number to do reverse order");
		number = scan.nextInt();
		test1.reverseOrder2(number);
	}

}
