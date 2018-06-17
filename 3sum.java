import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
	public static void main(String[] args) {
		// int[] nums1 = { -1, 0, 1, 2, -1, -4 };
		// int[] nums1 = { 0, 0, 0, 0 };
		// int[] nums1 = { 3,0,-2,-1,1,2 };
		int[] nums1 = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
		// int[] nums1 = { 0, -4, -1, -4, -2, -3, 2 };
		System.out.println(getResult(nums1));
	}

	public static List<List<Integer>> getResult(int[] nums) {
		Arrays.sort(nums);
		int len = nums.length;
		int[] lastArray = null;
		List<List<Integer>> result = new ArrayList<>();
		if (len < 3)
			return result;
		for (int i = 0; i < len - 2; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int j = i + 1, k = len - 1, sum = 0 - nums[i];
				while (j < len && k > j) {
					// List<Integer> intArray = new ArrayList<Integer>();
					int sum2 = nums[j] + nums[k];
					if (sum == sum2) {
						List<Integer> intArray = new ArrayList<Integer>();
						System.out.println(Arrays.toString(lastArray));
						System.out.println();

						intArray.addAll(Arrays.asList(nums[i], nums[j], nums[k]));
						int[] nowArray = { nums[i], nums[j], nums[k] };
						System.out.println(Arrays.toString(nowArray));
//						if (!result.contains(intArray))
//							result.add(intArray);
						if (lastArray != null && !Arrays.equals(lastArray, nowArray))
							result.add(intArray);
						else if (lastArray == null) 
							result.add(intArray);
						lastArray = nowArray;
						j++;
						k--;
					} else if (sum > sum2) {
						j++;
					} else {
						k--;
					}
				}
			}
		}
		return result;
	}
}