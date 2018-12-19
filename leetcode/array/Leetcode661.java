

/**
 * Leetcode661
 */
public class Leetcode661 {

    public int[][] imageSmoother(int[][] M) {

        int result[][] = new int[M.length][M[0].length];
        
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                int sum = M[i][j];
                int count = 1;
                if (i - 1 >= 0) {
                    sum += M[i-1][j];
                    count++;
                }
                if (j - 1 >= 0) {
                    sum += M[i][j-1];
                    count++;
                }
                if (i + 1 <= M.length -1) {
                    sum += M[i+1][j];
                    count++;
                }
                if (j + 1 <= M[0].length - 1) {
                    sum += M[i][j+1];
                    count++;
                }

                if (i - 1 >= 0 && j - 1 >= 0) {
                    sum += M[i-1][j-1]; 
                    count++;
                }
                if (i + 1 <= M.length -1 && j +1 <= M[0].length -1) {
                    sum += M[i+1][j+1]; 
                    count++;
                }

                if (i - 1 >= 0 && j + 1 <= M[0].length - 1) {
                    sum += M[i-1][j+1];
                    count++;
                }

                if (i + 1 <= M.length -1 && j -1 >=0) {
                    sum += M[i+1][j-1];
                    count++;
                }  

                result[i][j] = ((Number)Math.ceil(sum/count)).intValue();
            }
        }


        return result;
    }
    
    public static void main(String[] args) {

        Leetcode661 leetcode661 = new Leetcode661();

        
        int M[][] = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        /*
        int M[][] = {
            {2,3,4},
            {5,6,7},
            {8,9,10},
            {11,12,13},
            {14,15,16}
        };
        */

        int result[][] = leetcode661.imageSmoother(M);

        print2DArray(result);
        
    }

    static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}