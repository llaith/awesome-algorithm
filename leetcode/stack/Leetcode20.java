import java.util.Stack;

/**
 * Leetcode20
 */
public class Leetcode20 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(')');
            }else if (s.charAt(i) == '[') {
                stack.push(']');
            } else if (s.charAt(i) == '{') {
                stack.push('}');
            }
            else {
                if (stack.empty() || stack.pop() != s.charAt(i)) {
                    return false;
                }
            }
        }
        if(!stack.empty()) {
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Leetcode20 leetcode20 = new Leetcode20();

        System.out.println(leetcode20.isValid("()"));
        System.out.println(leetcode20.isValid("()[]{}"));
        System.out.println(leetcode20.isValid("(]"));
        System.out.println(leetcode20.isValid("([)]"));
        System.out.println(leetcode20.isValid("{[]}"));

    }
}