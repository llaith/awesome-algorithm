public class Leetcode237 {

	public ListNode head;
	
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
    }
	
	
	public static void main(String[] args) {
		Leetcode237 leetcode237 = new Leetcode237();
		leetcode237.head = new ListNode(4);
		ListNode node1 = new ListNode(5);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(9);
		leetcode237.deleteNode(new ListNode(5));
		
		ListNode tmp = leetcode237.head;
		while(tmp != null) {
			System.out.println(tmp.val);
			tmp = tmp.next;
		}
	}
}