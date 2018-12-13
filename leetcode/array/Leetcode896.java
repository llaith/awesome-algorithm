import java.util.Stack;

/**
 * Leetcode896
 */
public class Leetcode896 {

    public boolean isMonotonic(int[] A) {

        if(A.length <= 1) {
            return true;
        }

        boolean increasing = true;

        boolean decreasing = true;

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < A.length; i++) {
            if (stack.size() <= 0) {
                stack.push(A[i]);
            } else {
                if (A[i] <= stack.peek()) {
                    stack.push(A[i]);
                } else {
                    increasing = false;
                    break;
                }
            }
        }

        stack = new Stack<>();

        for (int j =0; j < A.length; j++) {

            if (stack.size() <= 0) {
                stack.push(A[j]);
            } else {
                if (A[j] >= stack.peek()) {
                    stack.push(A[j]);
                } else {
                    decreasing = false;
                    break;
                }
            }
        }

        return increasing || decreasing;
    }
    

    public static void main(String[] args) {

        int A[] = new int[]{1,3,2};

        Leetcode896 leetcode896 = new Leetcode896();
        System.out.println(leetcode896.isMonotonic(A));
        
    }
}