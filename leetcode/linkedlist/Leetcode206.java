
/**
 * Leetcode206
 */
public class Leetcode206 {

    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;

        while(current != null) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        return prev;
    }



    public static void main(String[] args) {
        Leetcode206 leetcode206 = new Leetcode206();
        ListNode head = leetcode206.new ListNode(1);
        ListNode node1 = leetcode206.new ListNode(2);
        ListNode node2 = leetcode206.new ListNode(3);
        ListNode node3 = leetcode206.new ListNode(4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        ListNode result = leetcode206.reverseList(head);

        ListNode index = result;
        while (index != null) {
            System.out.println(index.val);
            index = index.next;
        }
    }
    

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { 
            val = x; 
        }
    }
}