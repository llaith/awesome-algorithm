



/**
 * Leetcode167
 */
public class Leetcode167 {

    public int[] twoSum(int[] numbers, int target) {
     
        int result[] = new int[2];

        int begin = 0;
        int end = numbers.length - 1;

        while (begin < end) {
            if (numbers[begin] + numbers[end] > target) {
                end--;
            } else if (numbers[begin] + numbers[end] < target) {
                begin++;
            } else {
                result[0] = begin + 1;
                result[1] = end + 1;
                break;
            }
        }

        return result;
        
    }

    public static void main(String[] args) {
        Leetcode167 leetcode167 = new Leetcode167();

        int nums[] = {2, 7, 11, 15};

        int result[] = leetcode167.twoSum(nums, 9);

        printBinaryArray(result);
    }


    static void printBinaryArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}