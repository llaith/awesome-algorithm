

/**
 * Leetcode747
 */
public class Leetcode747 {

    public int dominantIndex(int[] nums) {
        int result = -1;

        int maxIndex = 0;

        int secondIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                secondIndex = maxIndex;
                maxIndex = i;
            }            
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && secondIndex == -1) {
                secondIndex = i;
            }else if (i != maxIndex && secondIndex != -1 &&nums[i] > nums[secondIndex]) {
                secondIndex = i;
            }

        }

        if (secondIndex < 0 || nums[secondIndex] * 2 <= nums[maxIndex]) {
            result = maxIndex;
        }


        return result;
    }
    
    public static void main(String[] args) {
        Leetcode747 leetcode747 = new Leetcode747();
        int nums[] = {1};
        System.out.println(leetcode747.dominantIndex(nums));
    }
}