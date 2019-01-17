import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode137
 */
public class Leetcode137 {

    public int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>(nums.length /2);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }

    
    public static void main(String[] args) {
        Leetcode137 leetcode137 = new Leetcode137();
        int nums[] = {2,2,2,3};
        System.out.println(leetcode137.singleNumber(nums));
    }
}