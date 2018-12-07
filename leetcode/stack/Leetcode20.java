import java.util.HashMap;
import java.util.Stack;

/**
 * Leetcode20
 */
public class Leetcode20 {

    private Stack<Character> stack;

    private HashMap<Character,Character> items;

    public boolean isValid(String s) {

        this.stack = new Stack<>();
        this.items = new HashMap<>();

        items.put(')', '(');
        items.put(']', '[');
        items.put('}', '{');

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if (stack.empty() || stack.pop() != items.get(s.charAt(i))) {
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