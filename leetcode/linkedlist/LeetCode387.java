public class LeetCode387 {

	public int firstUniqChar(String s) {
        
		char[] chars = s.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>(10); 
		
		for (int i = 0; i < chars.length; i++) {
			if (map.containsKey(chars[i])) {
				if (map.get(chars[i]) == 1) {
					map.put(chars[i], map.get(chars[i]) + 1);
				}
			} else {
				map.put(chars[i], 1);
			}
		}
		
		for (int i = 0; i < chars.length; i++) {
			if (map.get(chars[i]) == 1) {
				return i;
			}
		}		
		return -1;
    }
	
	public static void main(String[] args) {
		LeetCode387 leetCode387 = new LeetCode387();
		System.out.println(leetCode387.firstUniqChar("loveleetcode"));
	}
}
