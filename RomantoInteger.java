package leetCode;

public class test {
	static char[] romanArray = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
	static int[] intArray = { 1, 5, 10, 50, 100, 500, 1000 };

	public static void main(String[] args) {
		String[] strs = { "LVIII" };
		int[] answer = { 1994 };
		for (int i = 0; i < strs.length; i++) {
			System.out.println("-------" + i + "-------");
			int res = getResult(strs[i]);
			System.out.println(res);
			if (res != answer[i]) {
				System.out.println("errrrrrrrrrrrrrrrrror");
			}
		}
		System.out.println("errrrrrrrrrrrrrrrrror");

	}

	public static int getResult(String str) {
		char[] charArray = str.toCharArray();
		int res = 0, previous = getNum(charArray[0]);
		for (int i = 1; i < charArray.length; i++) {
			int now = getNum(charArray[i]);
			if (now <= previous)
				res += previous;
			else
				res -= previous;
			previous = now;
		}
		res += previous;
		return res;
	}

	public static int getNum(char c) {
		for (int i = 0; i < romanArray.length; i++)
			if (romanArray[i] == c)
				return intArray[i];
		return 0;
	}

}
