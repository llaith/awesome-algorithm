public class Leetcode215 {

	public int findKthLargest(int[] nums, int k) {
		int result = 0;

		result = findKthCR(nums, k, 0, nums.length - 1);

		return result;
	}

	private int findKthCR(int[] nums, int target, int begin, int end) {
		int pvoit = pvoit(nums, begin, end);

		if ( (pvoit + 1) == target) {
			 return nums[pvoit];
		} else if (pvoit + 1 > target ) {
			return findKthCR(nums, target, begin, pvoit -1);
		} else {
			return findKthCR(nums, target, pvoit + 1, end);
		}
	}

	private int pvoit(int[] nums, int begin, int end) {
		int pvoit = nums[end];
		int index = begin;

		for (int i = begin; i < end; i++) {
			if (nums[i] > pvoit) {
				int tmp = nums[i];
				nums[i] = nums[index];
				nums[index++] = tmp;
			}
		}

		int tmp = nums[index];
		nums[index] = nums[end];
		nums[end] = tmp;

		return index;
	}

	public static void main(String[] args) {
		Leetcode215 leetcode215 = new Leetcode215();
		int[] nums = {3, 2, 1, 5, 6, 4};
		System.out.println(leetcode215.findKthLargest(nums, 2));

		for (int i : nums) {
			System.out.print(i +" ");
		}
	}
}