
/**
 * Leetcode485
 */
public class Leetcode485 {

    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) {
                temp += nums[i];
            } 
            
            if (temp > result) {
                result = temp;
            } 

            if (nums[i] <= 0) {
                temp = 0;
            }
        }

        return result;
    }
    

    public static void main(String[] args) {
        Leetcode485 leetcode485 = new Leetcode485();

        int[] nums = {1,1,0,1,1,1};

        System.out.println(leetcode485.findMaxConsecutiveOnes(nums));
        
    }
}