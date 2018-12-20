
/**
 * Leetcode283
 */
public class Leetcode283 {

    public void moveZeroes(int[] nums) {
        if (nums.length <= 1) {
            return;
        }

        /**
         * ToDo 时间复杂度过高，需要减少一个循环
         */
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == 0) {
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }

                } else {
                    break;
                }
            }
        }

        /*
        int index = nums.length - 1;

        for (int i = 0; i < nums.length; ) {
            if (nums[i] == 0) {
                int temp = nums[index];
                nums[index--] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }

            if (i == index) {
                break;
            }
        }*/
        
    }
    

    public static void main(String[] args) {

        Leetcode283 leetcode283 = new Leetcode283();
        int nums[] = {0,1,0,3,12};

        leetcode283.moveZeroes(nums);

        printBinaryArray(nums);
    }


    static void printBinaryArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}