package TestCover;

import static org.junit.Assert.*;

import org.junit.Test;

import MathTest.Task1;

public class Test1 {
Task1 task= new Task1();
	@Test
	public void test() {
		int number= 965;
		int reversNumber=task.reverseOrder2(569);
		
		assertEquals(number,reversNumber);
	}

}
