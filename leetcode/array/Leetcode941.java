
/**
 * Leetcode941
 */
public class Leetcode941 {

    public boolean validMountainArray(int[] A) {
        int index = -1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i-1] && index == -1) {
                continue;
            } else if (A[i] < A[i-1] && index == -1) {
                index = i -1;
            } else if (A[i] < A[i-1] && index != -1) {
                continue;
            }
            else {
                return false;
            }
        }
        if (index != -1 && index != 0) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Leetcode941 leetcode941 = new Leetcode941();
        //int[] nums = {0,3,2,1};
        //int[] nums = {0,1,2,1,2};
        //int[] nums = {0,1,2,4,2,1};
        int[] nums = {1,7,9,5,4,1,2};
        System.out.println(leetcode941.validMountainArray(nums));
    }
}