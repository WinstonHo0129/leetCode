package leetCode;

import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		String [] strList = {"-91283472332","3.14159","words and 987","+","+-2", ""};
		for(int i =0;i<strList.length;i++) {
			System.out.println(getResult(strList[i]));
			System.out.println("---------------");
		}
	}

	public static int getResult(String s) {
		s = s.trim();
		char[] charArray = s.toCharArray();
		int len = charArray.length;
		int endIndex = -1;
		int startIndex = 0;
		if(len == 0){
			return 0;
		}
		if(isSign(charArray[0])){
			startIndex = 1;
		}
		for (int i = startIndex; i < len; i++) {
			if (!isNum(charArray[i]))
				break;
			endIndex = i;
		}
		if (endIndex == -1)
			return 0;
		System.out.println("end index: " + endIndex);
		String str = new String(charArray).substring(0, endIndex + 1);
		try {
			return Integer.valueOf(str);
		} catch (NumberFormatException e) {
			if (charArray[0] == '+' && len == 1)
				return 0;
			if (charArray[0] == '-' && len == 1)
				return 0;
			if (charArray[0] == '-')
				return Integer.MIN_VALUE;
			return Integer.MAX_VALUE;
		}
	}
	public static boolean isSign(char c) {
		if ((c == '+' || c == '-')) {
			return true;
		}
		return false;
	}

	public static boolean isNum(char c) {
		int num = Character.getNumericValue(c);
		if ((num <= 9 && num >= 0)) {
			return true;
		}
		return false;
	}
}
