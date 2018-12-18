import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode217
 */
public class Leetcode217 {

    public boolean containsDuplicate(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
    
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], 1);
            }
        }
    
        return false;
    }

    


    public static void main(String[] args) {
        Leetcode217 leetcode217 = new Leetcode217();

        int nums[] = {1,2,3,4,5,6,5};

        System.out.println(leetcode217.containsDuplicate(nums));
    }
}