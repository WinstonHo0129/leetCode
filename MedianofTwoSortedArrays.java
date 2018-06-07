import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		int[] nums1 = { 1,2 };
		int[] nums2 = { 3,4 };
		System.out.println(getResult(nums1, nums2));
	}

	public static double getResult(int[] nums1, int[] nums2) {
		int len1 = nums1.length;
		int len2 = nums2.length;
		int totalNum = len1 + len2;
		boolean doubleNumber = false;
		int threhold = 0;
		if (totalNum % 2 != 0) {
			threhold = (totalNum + 1) / 2;
		} else {
			doubleNumber = true;
			threhold = (totalNum / 2) + 1;
		}
		List<Integer> list = new ArrayList<>();

		if (len1 == 0 || len2 == 0) {
			int[] targetNums;
			targetNums = (len1 == 0)? nums2: nums1;
			return doubleNumber? (float) (targetNums[threhold - 2] + (targetNums[threhold - 1])) / 2 : (float) (targetNums[threhold - 1]);
		}
		int j = 0;
		for (int i = 0; i < len1; i++) {
			while (j < len2 && nums1[i] > nums2[j]) {
				list.add(nums2[j]);
				j++;
				if (list.size() == threhold) {
					return getMedian(doubleNumber, i - 1, j, list);
				}
			}
			list.add(nums1[i]);
			if (list.size() == threhold) {
				return getMedian(doubleNumber, i, j, list);
			}
		}
		for (int i = j; i < len2; j++) {
			if (list.size() == threhold) {
				return getMedian(doubleNumber, len1 - 1, j, list);
			}
			list.add(nums2[j]);
		}
		return 0;
	}

	public static double getMedian(boolean doubleNumber, int i, int j, List<Integer> list) {
		return doubleNumber? (float) (list.get(i + j - 1) + list.get(i + j)) / 2 : list.get(i + j);
	}
}