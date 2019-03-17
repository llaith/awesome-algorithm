
public class LeetCode172 {

	public int trailingZeroes(int n) {
		
		/*
		long tmpResult = 1;
		
		while(n > 0) {
			tmpResult *= n;
			n = n - 1;
			System.out.println(tmpResult);
		}
		int count = 0;
		
		
		while (tmpResult >= 10) {
			if (tmpResult % 10 == 0) {
				count++;
				tmpResult = tmpResult / 10;
			} else {
				break;
			}
		}*/
		
		int count = 0;
		
		while (n != 0) {
			n /= 5;	
			count += n;
		}
		
		return count;
    }
	
	public static void main(String[] args) {
		LeetCode172 leetCode172 = new LeetCode172();
		System.out.println(leetCode172.trailingZeroes(13));
		
		//long result = 13 *12*11*10*9*8*7*6*5*4*3*2;
		//System.out.println(result);
		
	}
}