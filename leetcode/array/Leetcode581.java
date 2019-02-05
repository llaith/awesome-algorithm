
public class Leetcode581 {


    public int findUnsortedSubarray(int[] nums) {

        int begin = 0;
        int end = -1;
        int n = nums.length - 1;
        int max = nums[0];
        int min = nums[n];


        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[n - i]);
            if (nums[i] < max) {
                end = i;
            }
            if (nums[n - i] > min) {
                begin = n - i;
            }
        }

        return end - begin + 1;
    }

    public static void main(String[] args) {
        Leetcode581 leetcode581 = new Leetcode581();
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        System.out.println(leetcode581.findUnsortedSubarray(nums));        
    }
}