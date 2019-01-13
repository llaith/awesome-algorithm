import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Leetcode914
 */
public class Leetcode914 {

    public boolean hasGroupsSizeX(int[] deck) {

        boolean result = false;

        if (deck.length <= 1) {
            return result;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < deck.length; i++) {
            if (!map.containsKey(deck[i])) {
                map.put(deck[i], 1);                
            } else if (map.containsKey(deck[i])) {
                map.put(deck[i], map.get(deck[i]) + 1);
            }
        }

        result = true;
        Object[] list = map.values().toArray();
        
        if (list.length <= 1) {
            return result;
        }

        int temp = gcd((Integer)list[0], (Integer)list[1]);
        for (Integer i : map.values()) {
            if (i == 1) {
                return false;
            }
            if (gcd (i, temp) == 1) {
                result = false;
                break;
            }
        }

        return result;
    }

    public int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }
    
    public static void main(String[] args) {
        Leetcode914 leetcode914 = new Leetcode914();
        //int[] deck = {1,2,3,4,4,3,2,1};
        //int[] deck = {1,1,2,2,2,2};
        //int [] deck = {0,0,0,1,1,1,2,2,2};
        int[] deck = {1,1,1,1,2,2,2,2,2,2};
        //int[] deck = {0,0,1,1,1,1,2,2,3,4};
        System.out.println(leetcode914.hasGroupsSizeX(deck));    
    }
}