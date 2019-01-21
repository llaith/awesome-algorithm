
/**
 * Leetcode135
 */
public class Leetcode135 {

    public int candy(int[] ratings) {
        int[] arr1 = new int[ratings.length];
        int[] arr2 = new int[ratings.length];
        arr1[0] = 1;
        arr2[ratings.length - 1] = 1;
        for(int i = 1; i < ratings.length; i++) {
            if (ratings[i - 1] >= ratings[i]) {
                arr1[i] = 1;
            } else {
                arr1[i] = arr1[i - 1] + 1;
            }
        }
        for(int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i + 1] >= ratings[i]) {
                arr2[i] = 1;
            } else {
                arr2[i] = arr2[i + 1] + 1;
            }
        }
        int result = 0;

        for (int i = 0; i < ratings.length; i++) {
            result += Math.max(arr1[i], arr2[i]);
        }
        
        return result;        
    }

    public static void main(String[] args) {
        Leetcode135 leetcode135 = new Leetcode135();
        int[] ratings = {1,0,2};
        System.out.println(leetcode135.candy(ratings));
    }
}