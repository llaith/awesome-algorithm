import java.util.LinkedList;

/**
 * Time complex O(N)
 * Space complex O(N)
 */
public class Leetcode125 {

	public boolean isPalindrome(String s) {
		LinkedList<Character> stack1 = new LinkedList<Character>();
		LinkedList<Character> stack2 = new LinkedList<Character>();
		
		char[] chars = s.toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			if (isAlph(chars[i]) || isNum(chars[i])) {
				stack1.push(chars[i]);
			}
		}
		
		for (int i = chars.length - 1; i >= 0; i--) {
			if (isAlph(chars[i]) || isNum(chars[i])) {
				stack2.push(chars[i]);
			}
		}
		
		while (!stack1.isEmpty() && !stack2.isEmpty()) {
			char c1 = stack1.pop();
			char c2 = stack2.pop();
			
			if (c1 != c2 ) {
				if (isAlph(c1) && isAlph(c2)) {
					if (Math.abs(c1 - c2) != 32) {
						return false;
					}
				} else {					
					return false;
				}
			}
		}
		
		return true;
    }
	
	private boolean isAlph(char c) {
		if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
			return true;
		}
		return false;
	}
	
	private boolean isNum(char c) {
		if (c >= 48 && c <= 57) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Leetcode125 leetcode125 = new Leetcode125();
		System.out.println(leetcode125.isPalindrome("`l;`` 1o1 ??;l`"));
		//System.out.println(leetcode125.isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println('`' -1);
	}
}
