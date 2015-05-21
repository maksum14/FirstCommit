package MathTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javax.print.attribute.HashAttributeSet;

public class Task322 {
	// 322. Найти натуральное число от 1 до 10 000 с максимальной суммой
	// делителей.
	Map<Integer, Long> maplist = new TreeMap();

	public void arr() {
		for (int i = 1; i <= 10000; i++) {
			funk(i);
		}
		back();
	}

	public void funk(int maxDivisors) {

		long sum = 0;
		for (long i = 1; i <= maxDivisors; i++) {
			long localZmina = maxDivisors % i;

			if (localZmina != 0) {
				continue;
			}

			sum += i;

		}
		maplist.put(maxDivisors, sum);

	}

	public void back() {
		Long max = 0L;
		Integer currentInt = 0;
		Set<Entry<Integer, Long>> set = maplist.entrySet();
		Iterator<Entry<Integer, Long>> iter = set.iterator();
		while (iter.hasNext()) {
			Entry<Integer, Long> tmp = iter.next();
			if (tmp.getValue() > max) {
				max = tmp.getValue();
				currentInt = tmp.getKey();
			}
		}

		System.out.println("Number is " + currentInt + " max has " + max);
		 
	}

	public static void main(String[] args) {
		Task322 task = new Task322();
		task.arr();
		// task.funk(100);
		// System.out.println(task.maplist);

	}
}