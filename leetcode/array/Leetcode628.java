import java.util.Arrays;

/**
 * Leetcode628
 */
public class Leetcode628 {

    public int maximumProduct(int[] nums) {
        int result = 0;

        Arrays.sort(nums);

        int end = nums.length - 1;
        int nearEnd = nums.length - 2;

        /**
         * 0 不用考虑吗？？？
         */
        if (nums[end] <= 0 && nums[nearEnd] <= 0) {
            result = nums[0] * nums[1] + nums[end];
            return result;
        }

        result = Math.max(nums[0] * nums[1] * nums[end], nums[end] * nums[nearEnd]* nums[nearEnd - 1]);
        
        return result;
    }
    
    public static void main(String[] args) {
        Leetcode628 leetcode628 = new Leetcode628();
        int nums[] = {-1,-2,-3,-4,0,0,0};
        System.out.println(leetcode628.maximumProduct(nums));
    }
}