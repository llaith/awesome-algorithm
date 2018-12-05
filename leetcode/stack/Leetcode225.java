import java.util.LinkedList;
import java.util.Queue;

/**
 * Leetcode225
 */
public class Leetcode225 {
    private Queue<Integer> q1 = new LinkedList<>();

    private Queue<Integer> q2 = new LinkedList<>();

    /** Push element x onto stack. */
    public void push(int x) {
        while(!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        q1.add(x);
        while(!q2.isEmpty()) {
            q1.add(q2.poll());
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q1.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return q1.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }

    
    public static void main(String[] args) {
        Leetcode225 stack = new Leetcode225();
        stack.push(1);
        stack.push(2);  
        System.out.println(stack.top());   // returns 2
        System.out.println(stack.pop());   // returns 2
        System.out.println(stack.empty()); // returns false
    }
}