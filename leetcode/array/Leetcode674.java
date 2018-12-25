import java.util.Stack;

/**
 * Leetcode674
 */
public class Leetcode674 {

    public int findLengthOfLCIS(int[] nums) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (stack.empty() || nums[i] > stack.peek()) {
                stack.push(nums[i]);
            } else {
                if (stack.size() > result) {
                    result = stack.size();
                }
                stack = new Stack<>();
                stack.push(nums[i]);
            }
        }
        result = result < stack.size() ? stack.size() : result;
        return result;
    }
    

    public static void main(String[] args) {
        Leetcode674 leetcode674 = new Leetcode674();
        //int nums[] = {1,3,5,4,7};
        //int nums[] = {2,2,2,2,2};
        int nums[] = {1,3,5,4,2,3,4,5};
        //int nums[] = {2,1,3};
        System.out.println(leetcode674.findLengthOfLCIS(nums));
    }
}