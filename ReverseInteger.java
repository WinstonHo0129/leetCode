package leetCode;

import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		// String s = "PAYPALISHIRING";
		long startTime = System.nanoTime();
		int x = 563847412;
		// int x = 1563847412;
		System.out.println(getResult(x));
		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");
	}

	public static int getResult(int x) {
		List<Integer> intList = new ArrayList<Integer>();
		int num = 0;
		while (x != 0) {
			num = x % 10;
			intList.add(num);
			x = x-num;
			x = x/ 10;
		}
		int res = 0;
		int len = intList.size();
		for (int i = 0; i < len; i++) {
			try {
				int addNumber = Math.multiplyExact(intList.get(i), (int) Math.pow(10, len - 1 - i));
				res = Math.addExact(res, addNumber);
				System.out.println("addNumber" + addNumber);
			} catch (ArithmeticException ex) {
				return 0;
			}
			System.out.println("res " + res);
		}
		return res;
	}
}
