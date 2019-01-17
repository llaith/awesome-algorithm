import java.util.HashSet;
import java.util.Set;

/**
 * Leetcode136
 */
public class Leetcode136 {


    public int singleNumber(int[] nums) {
     
        Set<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
           if (!hashSet.contains(nums[i]) ) {
               hashSet.add(nums[i]);
           } else { 
               hashSet.remove(nums[i]);
            }
        }
        return hashSet.iterator().next();
    }

    public static void main(String[] args) {
        Leetcode136 leetcode136 = new Leetcode136();
        int nums[] = {2,2,1};
        System.out.println(leetcode136.singleNumber(nums));
    }
}