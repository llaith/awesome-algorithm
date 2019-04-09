import java.util.Objects;

/**
 * Time complex O(N)
 * Space complex O(i)
 */
public class Leetcode28 {

	 public int strStr(String haystack, String needle) {

		 if (null == needle || Objects.equals("", needle)) {
		 	 return 0;
		 }
		 if (needle.length() > haystack.length()) {
             return -1;
         }
		 
		 for (int j = 0; j < haystack.length(); j++) {
			 if (j + needle.length() <=  haystack.length()) {
				 if (Objects.equals(haystack.substring(j, j + needle.length()), needle)) {
					 return j;
				 }
			 }
		 }
		 return -1; 
	 }
	 
	public static void main(String[] args) {
		Leetcode28 leetcode28 = new Leetcode28();
		System.out.println(leetcode28.strStr("a", "a"));
	}
}
