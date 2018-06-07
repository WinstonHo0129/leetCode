
import java.util.ArrayList;
import java.util.List;

public class test {
	static char[] charArray;
	static int length;
	static String str;

	public static void main(String[] args) {
		// System.out.println("aaa");
		str = "aaaa";
		System.out.println(getResult());
	}

	public static String getResult() {
		charArray = str.toCharArray();
		length = charArray.length;
		String result = "";
		for (int i = 0; i < length; i++) {
			String r1 = fun1(i);
			String r2 = fun2(i);
			if (r1 != null && r1.length() > result.length()) {
				result = r1;
			}
			if (r2 != null && r2.length() > result.length()) {
				result = r2;
			}
		}
		if (result.isEmpty())
			result = charArray[0] + "";
		return result;
	}

	public static String fun1(int i) {
		int spread = 1;
		int left = i - spread;
		int right = i + spread;
		while (left >= 0 && right < length && charArray[left] == charArray[right]) {
			spread++;
			left = i - spread;
			right = i + spread;
		}
		if (spread != 1) {
			return str.substring(left + 1, right);
		} else
			return null;
	}

	public static String fun2(int i) {
		int spread = 0;
		int left = i - spread;
		int right = i + spread + 1;
		while (left >= 0 && right < length && charArray[left] == charArray[right]) {
			spread++;
			left = i - spread;
			right = i + spread + 1;
		}
		if (spread != 0) {
			return str.substring(left + 1, right);
		} else
			return null;
	}
}