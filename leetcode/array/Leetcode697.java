import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode697
 */
public class Leetcode697 {

    public int findShortestSubArray(int[] nums) {
        if (nums.length <= 1) {
            return 1;
        }
        Map<Integer, Integer> index1 = new HashMap<>();
        Map<Integer, Integer> index2 = new HashMap<>();
        Map<Integer, Integer> index3 = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!index1.containsKey(nums[i])) {
                index1.put(nums[i], i);
            }
            if (index3.containsKey(nums[i])) {
                index3.put(nums[i], index3.get(nums[i]) + 1);
            } else {
                index3.put(nums[i], 1);
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (!index2.containsKey(nums[i])) {
                index2.put(nums[i], i);
            }
        }

        int topCount = 0;
        int topCountIndex = -1;
        for (int i : index3.keySet()) {
            if (index3.get(i) > topCount) {
                topCount = index3.get(i);
                topCountIndex = i;
            } else if (index3.get(i) == topCount) {
                if (index2.get(i) - index1.get(i) < index2.get(topCountIndex) - index1.get(topCountIndex)) {
                    topCount = index3.get(i);
                    topCountIndex = i;
                }   
            }
        }
        return index2.get(topCountIndex) - index1.get(topCountIndex) + 1;
    }
    

    public static void main(String[] args) {
        Leetcode697 leetcode697 = new Leetcode697();
       //int nums[] = {1,2,2,3,1};
        //int nums[] = {1,2,2,3,1,4,2};
        int nums[] = {1,1,2,2,2,1};
        System.out.println(leetcode697.findShortestSubArray(nums));

    }
}