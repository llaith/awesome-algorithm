
import java.util.Arrays;

public class Leetcode977 {

	public int[] sortedSquares(int[] A) {
		
		if (A.length == 0) {
			return A;
		}
		boolean isNet = true;
		
		if (A[0] >= 0) {
			isNet = false;
		}
		
		for (int i = 0; i < A.length; i++) {
			A[i] = A[i] * A[i];
		}
		
		if (isNet == true) {
			Arrays.sort(A);
		}
				
		return A;
    }
	
	public static void main(String[] args) {
		Leetcode977 leetcode977 = new Leetcode977();
		
		int[] A = {-4, -1, 0, 3, 10};
		leetcode977.sortedSquares(A);
		
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}
}
