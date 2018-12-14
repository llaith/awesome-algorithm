import java.util.HashSet;
import java.util.Set;

/**
 * Leetcode888
 */
public class Leetcode888 {

    public int[] fairCandySwap(int[] A, int[] B) {
        int result[] = new int[2];
        Set<Integer> aSet = new HashSet<>();

        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < A.length; i++) {
            sumA += A[i];
            aSet.add(A[i]);
        }
        for(int j = 0; j < B.length; j++) {
            sumB += B[j];
        }

        int diff =  Math.abs(sumB - sumA);

        for (int j = 0; j < B.length; j++) {
            int target = 0;
            if (sumB > sumA) {
                target = B[j] - diff / 2;
            } else {
                target = B[j] + diff / 2;
            }
            if(aSet.contains(target)) {
                result[0] = target;
                result[1] = B[j];
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Leetcode888 leetcode888 = new Leetcode888();
        int A[] = new int[]{1,2, 5};
        int B[] = new int[]{2,4};
        int result[] =leetcode888.fairCandySwap(A, B);

        for (int i =0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}