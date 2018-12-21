import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode830
 */
public class Leetcode830 {

    public List<List<Integer>> largeGroupPositions(String S) {

        List<List<Integer>> result = new ArrayList<>(10);

        char[] s = S.toCharArray();

        int begin = 0;
        List<Integer> temp = null;
        for (int i = 0; i < s.length - 1; i++) {
            if (s[i] != s[i+1]) {
                if (i - begin + 1 >= 3) {
                    temp = new ArrayList<>(2);
                    temp.add(begin);
                    temp.add(i);
                    result.add(temp);
                }
                begin = i +1;
            }
        }

        if (begin != s.length-1 && s.length - begin >=3 && s.length > 2) {
            temp = new ArrayList<>(2);
            temp.add(begin);
            temp.add(s.length -1);
            result.add(temp);
        }

        
        return result;
    }
    

    public static void main(String[] args) {
        Leetcode830 leetcode830 = new Leetcode830();
        //String s = "abbxxxxzzy";
        String s = "babaaaabbb";
        //String s = "bababbabaa";

        List<List<Integer>> result = leetcode830.largeGroupPositions(s);
        
        for (List<Integer> list : result) {
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}