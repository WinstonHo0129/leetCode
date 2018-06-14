package leetCode;

public class test {
	static char[] romanArray = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
	static int[] intArray = { 1, 5, 10, 50, 100, 500, 1000 };

	public static void main(String[] args) {
		String[] strs = { "dog","racecar","car" };
		// int[] answer = { 1994 };
		// for (int i = 0; i < strs.length; i++) {
		// System.out.println("-------" + i + "-------");
		// int res = getResult(strs[i]);
		// System.out.println(res);
		// if (res != answer[i]) {
		// System.out.println("errrrrrrrrrrrrrrrrror");
		// }
		// }
		System.out.println("res:" + getResult(strs));

	}

	public static String getResult(String[] strs) {
		String res = "";
		int minLen = strs[0].length(), arrayLen = strs.length;

		for (int i = 1; i < arrayLen; i++) {
			minLen = Math.min(minLen, strs[i].length());
		}
		System.out.println("minleg:" + minLen);
		for (int i = 0; i < minLen; i++) {
			char c = strs[0].charAt(i);
			for (int j = 1; j < arrayLen; j++) {
				if (!(c == strs[j].charAt(i)))
					return res;
			}
			res += c;
		}
		return res;
	}
}
