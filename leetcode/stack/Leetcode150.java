import java.util.Stack;

/**
 * Leetcode150
 */
public class Leetcode150 {

    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        
        for (String s : tokens) {
            if (isOperator(s)) {
                Integer i1 = Integer.valueOf(stack.pop());
                Integer i2 = Integer.valueOf(stack.pop());
                int result = 0;
                if (s.equals("+")) {
                    result = i2 + i1;
                } else if (s.equals("-")) {
                    result = i2 - i1;
                } else if (s.equals("*")) {
                    result = i2 * i1;
                } else {
                    result = i2 / i1;
                }
                stack.push(result+"");
            } else {
                stack.push(s);
            }
        }

        return Integer.valueOf(stack.pop());
    }

    private boolean isOperator(String s) {
        if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Leetcode150 leetcode150 = new Leetcode150();
       // String tokens[] = {"2", "1", "+", "3", "*"}; 
        //String tokens[] = {"4", "13", "5", "/", "+"}; 
        String tokens[] = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}; 
        System.out.println(leetcode150.evalRPN(tokens));       
    }
}