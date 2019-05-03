public class Leetcode189 {

	public void rotate(int[] nums, int k) {
        
		for (int i = k; i > 0; i--) {
			int tmp = nums[nums.length - 1];
			int j = nums.length - 2;
			for (; j >= 0; j--) {
				nums[j + 1] = nums[j];
			}
			nums[j+1] = tmp;
		}
    }
	
	public static void main(String[] args) {
		Leetcode189 leetcode189 = new Leetcode189();
		int[] nums = {1,2,3,4,5,6,7};
		
		leetcode189.rotate(nums, 3);
		
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}
}