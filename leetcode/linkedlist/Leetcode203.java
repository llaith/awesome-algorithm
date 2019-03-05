public class Leetcode203 {

	public ListNode removeElements(ListNode head, int val) {
    
		while (head != null && head.val == val) {
			head = head.next;
		}
		
		ListNode tmp = head;
		
		while (tmp != null && tmp.next != null) {
			if (tmp.next.val == val) {
				tmp.next = tmp.next.next;
			} else {
				tmp = tmp.next;
			}
		}
		
		return head;
    }
	
	public static void main(String[] args) {
		Leetcode203 leetcode203 = new Leetcode203();
		ListNode head = new ListNode(1);
		//ListNode node1 = new ListNode(2);
		//ListNode node2 = new ListNode(6);
		//ListNode node3 = new ListNode(3);
		//ListNode node4 = new ListNode(4);
		//ListNode node5 = new ListNode(5);
		//ListNode node6 = new ListNode(6);
		//head.next = node1;
		//node1.next = node2;
		//node2.next = node3;
		//node3.next = node4;
		//node4.next = node5;
		//node5.next = node6;
		
		head = leetcode203.removeElements(head, 1);
		
		ListNode tmp = head;
		while (tmp != null) {
			System.out.println(tmp.val);
			tmp = tmp.next;
		}
	}
}