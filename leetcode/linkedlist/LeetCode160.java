
public class LeetCode160 {
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {	
		 ListNode a = headA;
	     ListNode b = headB;
	     // 此处注意，需要比较的是节点的引用是不是相同的，而不是比较值
	     while (a != b) {
	    	 if (a == null)  a = headB;
	         else a= a.next;
	         if (b == null)  b = headA;
	         else b = b.next;
        }

	    return a;
    }
	
	
	public static void main(String[] args) {
		LeetCode160 leetCode160 = new LeetCode160();
		ListNode headA = new ListNode(4);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(8);
		ListNode node3 = new ListNode(4);
		ListNode node4 = new ListNode(5);
		headA.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		ListNode headB = new ListNode(5);
		ListNode node5 = new ListNode(0);
		ListNode node6 = new ListNode(1);
		headB.next = node5;
		node5.next = node6;
		node6.next = node2;
		
		ListNode result = leetCode160.getIntersectionNode(headA, headB);
		
		ListNode tmp = result;
		while (tmp != null) {
			System.out.println(tmp.val);
			tmp = tmp.next;
		}
		
	}
}