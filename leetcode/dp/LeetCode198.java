public class LeetCode198 {

	/**
	 * Backtrack
	 * @param nums
	 * @return
	 */
	public int rob(int[] nums) {
		
		if (nums.length == 0) {
			return 0;
		}
		int[] map = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
            map[i] = -1;
        }
		return find(nums, map, nums.length - 1);
    }
	
	private int find(int[] nums, int[] map, int index) {
		if (index < 0) {
			return 0;
		}
		
		if (index >= 0) {
			if (map[index] != -1) {
				return map[index];
			}
		}
		map[index] = Math.max(find(nums, map, index - 1), find(nums, map, index - 2) + nums[index]);
		
		return map[index];
	}
	
	public static void main(String[] args) {
		LeetCode198 leetCode198 = new LeetCode198();
		System.out.println(leetCode198.rob(new int[] {2,7,9,3,1}));
	}
}
