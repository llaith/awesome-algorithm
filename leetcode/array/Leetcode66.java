

/**
 * Leetcode66
 */
public class Leetcode66 {

    public int[] plusOne(int[] digits) {

        int nineIndex = -1;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                nineIndex = i;
            }else {
                break;
            }
        }

        if (nineIndex == -1) {
            digits[digits.length - 1] += 1;
            return digits;
        }else if (nineIndex == 0) {
            int nums [] = new int[digits.length + 1];
            nums[0] = 1;
            return nums;
        }else {
            digits[nineIndex - 1] += 1;
            for (int i = nineIndex; i < digits.length ;i++) {
                digits[i] = 0;
            }
            return digits;
        }

    }

    public static void main(String[] args) {
        Leetcode66 leetcode66 = new Leetcode66();
        int digits[] = {9,9,9};
        printBinaryArray(leetcode66.plusOne(digits));
    }


    static void printBinaryArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}