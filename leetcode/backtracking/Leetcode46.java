public class Leetcode46 {

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();

		Integer[] integerNums = new Integer[nums.length];
		for (int i = 0; i < nums.length; i++) {
			integerNums[i] = nums[i];
		}

		dfs(result, integerNums, 0);

		return result;
	}

	private void dfs(List<List<Integer>> result, Integer[] nums, int n) {
		if (n == nums.length) {
			List<Integer> temp = new ArrayList<Integer>(Arrays.<Integer>asList(nums));
			result.add(temp);
		}

		for (int i = n; i < nums.length; i++) {
			swap(nums, i, n);
			dfs(result, nums, n+ 1);
			swap(nums, i, n);
		}
	}

	private void swap(Integer[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}


	public static void main(String[] args) {
		Leetcode46 leetcode46 = new Leetcode46();
		int[] nums = {1,2,3};
		List<List<Integer>> result = leetcode46.permute(nums);

		for (List<Integer> l1: result) {
			for (Integer i : l1) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}