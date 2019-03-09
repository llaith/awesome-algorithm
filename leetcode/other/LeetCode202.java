public class LeetCode202 {

	public boolean isHappy(int n) {
	
		if (n <= 0) {
			return false;
		}
		
		n = cal(n);
		
		while (n > 9 || n == 7) {
			n = cal(n);
		}

		if (n == 1) {
			return true;
		}
		
		return false;
    }
	
	private int cal(int n) {
		
		int result = 0;
		while (n > 0) {
			result += Math.pow(n % 10, 2);
			n = n / 10;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		LeetCode202 leetCode202 = new LeetCode202();
		System.out.println(leetCode202.isHappy(1111111));
	}
}

