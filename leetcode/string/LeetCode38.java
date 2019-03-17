
public class LeetCode38 {

	public String countAndSay(int n) {
    
		if (n == 1) {
			return "1";
		}
		
		if (n == 2) {
			return "11";
		}
		
		String re = countAndSay(n - 1);
		char[] tmp = re.toCharArray();
		String result = "";
		int count = 0;
		for (int i = 0; i < tmp.length; i++) {
			while(i < tmp.length - 1 && tmp[i] == tmp[i+1]) {
				count++;
				i++;
			}
			result += (count+1)+""+tmp[i];
			count= 0;
		}
		
		return result;
    }

	
	
	public static void main(String[] args) {
		LeetCode38 leetCode38 = new LeetCode38();
		System.out.println(leetCode38.countAndSay(5));
	}
}
