package leetcode.Y2019.M03;

import java.util.LinkedList;

public class LeetCode234 {

	public boolean isPalindrome(ListNode head) {
        if (head == null) {
        	return true;
        }
        
        LinkedList<Integer> stack = new LinkedList<Integer>();
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null) {
        	stack.push(slow.val);
        	slow = slow.next;
        	fast = fast.next.next;
        }
        
        if (fast != null) {
        	slow = slow.next;
        }
        
		while (slow != null) {
			if (!stack.isEmpty() &&stack.pop() == slow.val) {
				slow = slow.next;
			} else {
				return false;
			}
		}
		
		return stack.isEmpty() && true;
    }
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(1);
		//ListNode node3 = new ListNode(2);
		//ListNode node4 = new ListNode(1);
		head.next = node1;
		node1.next = node2;
		//node2.next = node3;
		//node3.next = node4;
		
		LeetCode234 leetCode234 = new LeetCode234();
		System.out.println(leetCode234.isPalindrome(head));
	}
}
