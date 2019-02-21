public class Leetcode151 {

	public String reverseWords(String s) {
		
		if (s ==  null || s.length() == 0) {
			return s;
		}
		s = s.replaceAll("^[　 ]*", "").replaceAll("[　 ]*$", "");
		String[] splitStrs = s.split(" ");
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = splitStrs.length - 1; i >= 0; i--) {
			if (i == 0) {
				stringBuilder.append(splitStrs[i]);
				continue;
			}
			if ("".equals(splitStrs[i])) {
				continue;
			}
			stringBuilder.append(splitStrs[i]+ " ");
		}
		return stringBuilder.toString();
    }
	
	
	public static void main(String[] args) {
		Leetcode151 leetcode151 = new Leetcode151();
		//String s = "the sky is blue";
		//String s = " 1";
		String s = "   a   b ";
		System.out.println(leetcode151.reverseWords(s));
	}
}
