

/**
 * Leetcode268
 */
public class Leetcode268 {

    public int missingNumber(int[] nums) {

        int result = nums.length;

        boolean zeroModify = false;

        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            if (num < nums.length) {
                nums[num] = - nums[num];
                if (nums[num] == 0) {
                    zeroModify = true;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result = i;
            }
            if (nums[i] == 0 && !zeroModify) {
                result = i;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Leetcode268 leetcode268 = new Leetcode268();
        // int nums[] = {3,0,1};
        int nums[] = {9,6,4,2,3,5,7,0,1};
        //int nums[] = {1};
        //int nums [] = {1,0};
        //int nums[] = {1,2};
        //int nums[] = {2,0};
        //int nums[] = {2,3,0};
        System.out.println(leetcode268.missingNumber(nums));

    }
}