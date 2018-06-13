package leetCode;

public class test {
	static char[] romanArray = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };

	public static void main(String[] args) {
		int[] nums = { 1994 };
		String[] answer = { "III" };
		for (int i = 0; i < nums.length; i++) {
			System.out.println("-------" + i + "-------");
			String res = getResult(nums[i]);
			System.out.println(res);
			if (res != answer[i]) {
				System.out.println("errrrrrrrrrrrrrrrrror");
			}
		}
		System.out.println("errrrrrrrrrrrrrrrrror");

	}

	public static String getResult(int num) {
		int unit = 0, i = 0;
		String res = "";
		do {
			unit = num % 10;
			res = getRoman(unit, i) + res;
			num = (num-unit)/10;
			i+=2;
		} while (num != 0);
		return res;
	}

	public static String getRoman(int num, int index) {
		char romanOne = romanArray[index];
		switch (num) {
		case 1:
			return new StringBuilder().append(romanOne).toString();
		case 2:
			return new StringBuilder().append(romanOne).append(romanOne).toString();
		case 3:
			return new StringBuilder().append(romanOne).append(romanOne).append(romanOne)
					.toString();
		case 4:
			return new StringBuilder().append(romanOne).append(romanArray[index + 1]).toString();
		case 5:
			return romanArray[index + 1] + "";
		case 6:
			return new StringBuilder().append(romanArray[index + 1]).append(romanOne).toString();
		case 7:
			return new StringBuilder().append(romanArray[index + 1]).append(romanOne).append(romanOne)
					.toString();
		case 8:
			return new StringBuilder().append(romanArray[index + 1]).append(romanOne).append(romanOne)
					.append(romanOne).toString();
		case 9:
			return new StringBuilder().append(romanOne).append(romanArray[index + 2]).toString();
		}
		return "";
	}
}
