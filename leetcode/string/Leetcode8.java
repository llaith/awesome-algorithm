public class Leetcode8 {

	public int myAtoi(String str) {
		
		if (str.length() == 0) {
			return 0;
		}
		int index = 0;
		int sign = 1;
		int total = 0;
		
		while (str.charAt(index) == ' ' && index < str.length()) {
			index++;
		}

		while(str.charAt(index) == '+' || str.charAt(index) == '-') {
			sign = str.charAt(index) == '+' ? 1 : -1;
			index++;
		}
		
		while(index < str.length()) {
			if (str.charAt(index) < '0' || str.charAt(index) > '9') {
				break;
			}
			int i = str.charAt(index) - '0';
			
			if (Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE%10 < i) {
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			
			total = total * 10 + i;
			index++;
		}
    
		return sign * total;
		/**
		String[] strs = str.split(" ");
		
		Pattern pattern = Pattern.compile("^[-\\+]?[\\d]+$");
		
		for (String s: strs) {
			if (!Objects.equals(s, "")) {
				
				if (Objects.equals(s, "+") || Objects.equals(s, "-")) {
					return 0;
				}
				
				Matcher matcher = pattern.matcher(s);
				
				if (matcher.find()) {
					s = matcher.group();
				} else {
					return 0; 
				}
				
				
				BigDecimal bigDecimal = new BigDecimal(s);
				
				if (bigDecimal.longValue() > Integer.MAX_VALUE) {
					return Integer.MAX_VALUE;
				} else if (bigDecimal.longValue() < Integer.MIN_VALUE) {
					return Integer.MIN_VALUE;
				} else {
					return bigDecimal.intValue();
				}
			} 		}
		
		return 0;
		**/
    }
	
	public static void main(String[] args) {
		Leetcode8 leetcode8 = new Leetcode8();
		
		System.out.println(leetcode8.myAtoi("2147483648"));
	}
}