package leetCode;

import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		System.out.println(getResult(s, 3));
	}

	public static String getResult(String s, int numRows) {
		String[] strArray = new String[numRows];
		for (int i = 0; i < numRows; i++) {
			strArray[i] = "";
		}
		int group = numRows * 2 - 2;
		if(group == 0)
			return s;
		for (int i = 0; i < s.length(); i++) {
			int num = i % group;
			if (num < numRows) {
				strArray[num] += s.charAt(i);
			} else {
				strArray[2 * numRows - (num + 2)] += s.charAt(i);
			}
		}
		String result = "";
		for (String str:strArray) {
			result += str;
		}
		return result;
	}
}
