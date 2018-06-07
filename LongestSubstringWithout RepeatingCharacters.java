
import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		// System.out.println("aaa");
		// String str = "abcabcbb";
		// String str = "bbbbb";
		// String str = "pwwkew";
		// String str = "dvdf";
		String str = "asjrgapa";
		System.out.println(getResult(str));
	}

	public static int getResult(String str) {
		int strLength = str.length();
		String temp = "";
		int resultLength = 0;
		for (int i = 0; i < strLength; i++) {
			String aChar = String.valueOf(str.charAt(i));
			if (temp.contains(aChar)) {
				resultLength = Math.max(resultLength, temp.length());
				temp = temp.substring(temp.indexOf(aChar)+1);
			}
			temp += aChar;
		}
		resultLength = Math.max(resultLength, temp.length());
		return resultLength;
	}
}