import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode169
 */
public class Leetcode169 {

    public int majorityElement(int[] nums) {
        int result = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (int i : map.keySet()) {
            if (map.get(i) > nums.length / 2) {
                return i;
            }
        }

        return -1;
    }

    

    public static void main(String[] args) {

        Leetcode169 leetcode169 = new Leetcode169();
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(leetcode169.majorityElement(nums));
    }
}