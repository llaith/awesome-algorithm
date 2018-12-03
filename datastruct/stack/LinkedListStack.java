import java.util.LinkedList;

/**
 * LinkedListStack
 */
public class LinkedListStack {

    private ListNode top = null;


    public boolean push(int data) {
        ListNode newNode = new ListNode(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        return true;
    }

    public int pop() {
        if (top == null) {
            return -1;
        }
        
        int result = top.val;
        top = top.next;

        return result;
    }



    public static void main(String[] args) {
        
        LinkedListStack linkedListStack = new LinkedListStack();
        System.out.println(linkedListStack.push(1));
        System.out.println(linkedListStack.push(2));
        System.out.println(linkedListStack.push(3));
        System.out.println(linkedListStack.push(4));
        System.out.println(linkedListStack.push(5));
        System.out.println(linkedListStack.push(6));

        System.out.println(linkedListStack.pop());
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { 
            val = x; 
        }
    }   
    
}