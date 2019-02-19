
public class Leetcode344 {

	public void reverseString(char[] s) {
        int begin = 0;
        int end =  s.length - 1;
        
        while(begin < end) {
        	char tmp = s[begin];
        	s[begin] = s[end];
        	s[end] = tmp;
        	begin++;
        	end--;
        }
    }
	
	public static void main(String[] args) {
		Leetcode344 leetcode344 = new Leetcode344();
		//char[] s = {'h', 'e', 'l', 'l', 'o'};
		char[] s= {'H','a','n','n','a','h'};
		leetcode344.reverseString(s);
		
		for (char c : s) {
			System.out.print(c + " ");
		}
	}
}