import java.util.Stack;

public class Leetcode32 {
    
    public static void main(String[] args) {
        Leetcode32 leetcode32 = new Leetcode32();
        
        System.out.println(leetcode32.longestValidParentheses("()()"));
    }

    public int longestValidParentheses(String s) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (!stack.empty())  {
                    result = Math.max(result, i - stack.peek());
                } else {
                    stack.push(i);
                }
            }
        }
        return result;
    }
}