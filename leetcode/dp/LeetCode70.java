public class LeetCode70 {

	/**
	public int climbStairs(int n) {
    
		if (n == 1) {
			return 1;
		}
		
		if (n == 2) {
			return 2;
		}
		return climbStairs(n - 1) + climbStairs(n - 2);
    }**/
	
	/**
	 * Time Complexity: O(N)
	 * Space Complexity: O(N)
	 * @param n
	 * @return
	 */
	public int climbStairs(int n) {
		int[] map = new int[n];
		
		return climb(n, map);
	}
	
	private int climb(int n, int[] map) {
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		if (map[n - 1] == 0 ) {
			map[n - 1] = climb(n - 1, map) + climb(n - 2, map);	
		}
		
		return map[n - 1];
	}
	
	public static void main(String[] args) {
		LeetCode70 leetCode70 = new LeetCode70();
		
		System.out.println(leetCode70.climbStairs(3));
	}
}

