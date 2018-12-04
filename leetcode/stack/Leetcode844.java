import java.util.Stack;

/**
 * Leetcode844
 */
public class Leetcode844 {

    public static boolean backspaceCompare(String S, String T) {

        Stack<Character> sStack = new Stack<>();

        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) != '#') {
                sStack.push(S.charAt(i));
            } else {
                if (sStack.size() > 0) {
                    sStack.pop();
                }
            }
        }

        Stack<Character> tStack = new Stack<>();
        
        for(int i = 0; i < T.length(); i++) {
            if(T.charAt(i) != '#') {
                tStack.push(T.charAt(i));
            } else {
                if(tStack.size() > 0) {
                    tStack.pop();
                }
            }
        }

    
        if(sStack.size() == tStack.size()) {

            for(int j = 0; j < sStack.size(); j++) {
                if(sStack.pop() != tStack.pop()) {
                    return false;
                } 
            }
        } else {
            return false;
        }

        return true;
    }
    

    public static void main(String[] args) {
        String S = "a#c";
        String T = "b";

        System.out.println(backspaceCompare(S, T));
    }
}