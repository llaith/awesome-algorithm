

/**
 * Leetcode27
 */
public class Leetcode27 {

    public int removeElement(int[] nums, int val) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                result += 1;
            } else {
                nums[i] = -1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
                if (nums[i] == -1) {
                    for (int j = i; j < nums.length; j++) {
                        if (nums[j] != -1) {
                            nums[i] = nums[j];
                            nums[j] = -1;
                            break;
                        }
                    }
                }
        }
        return result;
    }
    

    public static void main(String[] args) {
        Leetcode27 leetcode27 = new Leetcode27();
        int nums[] = {3,2,2,3};
        int result = leetcode27.removeElement(nums, 3);

        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}