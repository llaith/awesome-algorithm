
public class Leetcode371 {

	public int getSum(int a, int b) {
		
		System.out.println("a "+ a + ", b "+ b);
		return (b==0? a: getSum(a^b,(a&b)<<1));
    }
	
	
	public static void main(String[] args) {
		Leetcode371 leetcode371 = new Leetcode371();
		
		System.out.println(leetcode371.getSum(-2, 3));
    }	
}
