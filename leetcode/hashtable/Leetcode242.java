import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode242
 */
public class Leetcode242 {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charactersMap = new HashMap<Character, Integer>(); 
        
        for (int i = 0; i < s.length(); i++) {
            if(!charactersMap.containsKey(s.charAt(i))) {
                charactersMap.put(s.charAt(i), 1);
            } else {
                charactersMap.put(s.charAt(i), charactersMap.get(s.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (!charactersMap.containsKey(t.charAt(i))) {
                return false;
            } else if(charactersMap.get(t.charAt(i)) == 1) {
                charactersMap.remove(t.charAt(i));
            } else {
                charactersMap.put(t.charAt(i), charactersMap.get(t.charAt(i))- 1);
            }
        }

        if(charactersMap.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Leetcode242 leetcode242 = new Leetcode242();
        System.out.println(leetcode242.isAnagram("anagram", "nagaram"));
    }
}