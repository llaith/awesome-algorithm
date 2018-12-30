
/**
 * Leetcode724
 */
public class Leetcode724 {

    public int pivotIndex(int[] nums) {
        int result = -1;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 ) {
                left += nums[i - 1];
            }
            if (sum - left - nums[i] == left) {
                result = i;
                return result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Leetcode724 leetcode724 = new Leetcode724();
        int nums[] = {1,7,3,6,5,6};
        System.out.println(leetcode724.pivotIndex(nums));
    }
}