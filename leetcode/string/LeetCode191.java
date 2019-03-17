public class LeetCode191 {

	public int hammingWeight(int n) {
    
		String strb = Integer.toBinaryString(n);
		
		int count = 0;
		for (int i = 0; i < strb.length(); i++) {
			if (strb.charAt(i) == '1') {
				count++;
			}
		}
		
		return count;
    }
	
	public static void main(String[] args) {
		LeetCode191 leetCode191 = new LeetCode191();
		
		System.out.println(leetCode191.hammingWeight(5));
	}
}