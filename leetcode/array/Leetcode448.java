import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Leetcode448
 */
public class Leetcode448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]);
            if (nums[val - 1] > 0) {
                nums[val - 1] = -nums[val - 1];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Leetcode448 leetcode448 = new Leetcode448();

        int nums[] = {4,3,2,7,8,2,3,1};
        List<Integer> result = leetcode448.findDisappearedNumbers(nums);

        printList(result);
    }

    static <T> void printList(List<T> l) {
        for (T v : l) {
            System.out.println(v);
        }
    }
}