
/**
 * Leetcode840
 */
public class Leetcode840 {

    public int numMagicSquaresInside(int[][] grid) {
        int result = 0;

        if (grid.length < 3 || grid[0].length < 3) {
            return 0;
        }

        int[] nums = new int[9];
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[0].length - 2; j++) {
                nums[0] = grid[i][j];
                nums[1] = grid[i][j + 1];
                nums[2] = grid[i][j + 2];

                nums[3] = grid[i+1][j];
                nums[4] = grid[i+1][j+1];
                nums[5] = grid[i+1][j+2];

                nums[6] = grid[i+2][j];
                nums[7] = grid[i+2][j+1];
                nums[8] = grid[i+2][j+2];
                if (containAllNum(nums) && sammSum(nums)) {
                    result += 1;
                }
            }
        }


        return result;
    }

    public boolean containAllNum(int[] nums) {

        int[] count = new int[16];
        for (int v : nums) {
            count[v] = 1;
        }
        for (int i = 1; i < 10; i++) {
            if (count[i] != 1) {
                return false;
            }
        }
        return true;
    }

    public boolean sammSum(int[] nums) {

        return (nums[0] + nums[1] + nums[2] == 15 &&
                nums[3] + nums[4] + nums[5] == 15 &&
                nums[6] + nums[7] + nums[8] == 15 &&
                nums[0] + nums[3] + nums[6] == 15 &&
                nums[1] + nums[4] + nums[7] == 15 &&
                nums[2] + nums[5] + nums[8] == 15 &&
                nums[0] + nums[4] + nums[8] == 15 &&
                nums[2] + nums[4] + nums[6] == 15);
    }

    public static void main(String[] args) {
        Leetcode840 leetcode840 = new Leetcode840();
        int grid[][] = {
            {4,3,8,4},
            {9,5,1,9},
            {2,7,6,2}
        };
        System.out.println(leetcode840.numMagicSquaresInside(grid));
        
    }
    
}