import java.util.Stack;

/**
 * Leetcode232
 */
public class Leetcode232 {

    private Stack<Integer> s1 = new Stack<>();

    private Stack<Integer> s2 = new Stack<>();

    /** Initialize your data structure here. */
    public Leetcode232() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        while(!s1.empty()) {
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.empty()) {
            s1.push(s2.pop());
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    
        if(s1.empty()) {
            return -1;
        }
        
        return s1.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if (s1.empty()) {
            return -1;
        }
        return s1.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(!s1.empty()) {
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Leetcode232 queue = new Leetcode232();
        queue.push(1);
        queue.push(2);  
        System.out.println(queue.peek());  // returns 1
        System.out.println(queue.pop());   // returns 1
        System.out.println(queue.empty()); // returns false
    }
}