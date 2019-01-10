import java.util.ArrayList;

/**
 * Leetcode139
 */
public class Leetcode139 {

    public boolean wordBreak(String s, List<String> wordDict) {
        
        

        return false;
    }
    
    public static void main(String[] args) {
        Leetcode139 leetcode139 = new Leetcode139();
        List<String> wordDict = new ArrayList<>(new String[]{"leet", "code"});
        String str = "leetcode";
        System.out.println(leetcode139.wordBreak(str, wordDict));
    }
}