public class Leetcode238 {
	public int[] productExceptSelf(int[] nums) {

		int result = 0;
		int zeroCount = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				if (result == 0) {
					result = nums[i];
					continue;
				}
				result *=  nums[i];
			} else {
				zeroCount += 1;
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				if (zeroCount > 0) {
					nums[i] = 0;
				} else {
					nums[i] = result / nums[i];
				}
			} else {
				if (zeroCount <= 1) {
					nums[i] = result;
				} else {
					nums[i] = 0;
				}
			}
		}

		return nums;
	}

	public static void main(String[] args) {
		Leetcode238 leetcode238 = new Leetcode238();
		int[] nums = {1,2,3,4};

		nums = leetcode238.productExceptSelf(nums);

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}