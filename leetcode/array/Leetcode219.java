

/**
 * Leetcode219
 */
public class Leetcode219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
     
        if (nums.length == 0) {
            return false;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <= Math.min(i+k, nums.length -1); j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        
        return false;
    }


    public static void main(String[] args) {
        Leetcode219 leetcode219 = new Leetcode219();
        //int nums[] = {1,2,3,1};
        int nums[] = {99,99};
        System.out.println(leetcode219.containsNearbyDuplicate(nums, 3));
    }
}