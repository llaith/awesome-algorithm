import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode1
 */
public class Leetcode1 {

    public int[] twoSum(int[] nums, int target) {
     
        Map<Integer, Integer> map = new HashMap<>();

        int resultp[] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            map.put(target - nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]) && map.get(nums[i]) != i) {
                resultp[0] = i;
                resultp[1] = map.get(nums[i]);
            }
        }
        return resultp;
    }

    public static void main(String[] args) {
        Leetcode1 leetcode1 = new Leetcode1();
        int nums[] = new int[]{2,7,11,15};
        int result[] = leetcode1.twoSum(nums, 9);

        for(int j = 0; j < result.length; j++) {
            System.out.println(result[j]);
        }

    }
}