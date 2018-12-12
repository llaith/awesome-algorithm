
/**
 * Leetcode566
 */
public class Leetcode566 {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int result[][] = new int[r][c];

        if (nums.length <= 0) {
            return nums;
        }
        if(nums.length * nums[0].length != r *c) {
            return nums;
        }
        int row = 0;
        int colunm = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if( colunm >= c) {
                    row += 1;
                    colunm = 0;
                }
                result[row][colunm] = nums[i][j];
                colunm += 1;
            }
        }
        
        return result;
    }
    

    public static void main(String[] args) {
        Leetcode566 leetcode566 = new Leetcode566();
        int nums[][] = new int[][]{{1,2},{3,4}};

        int[][] result = leetcode566.matrixReshape(nums, 4, 1);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        } 
    }
}