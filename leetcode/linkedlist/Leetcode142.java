
/**
 * Leetcode142
 */
public class Leetcode142 {

    public ListNode detectCycle(ListNode head) {
        ListNode result = null;

        if (head == null) {
            return result;
        }

        ListNode l1 = head;
        ListNode l2 = head;

        while(l2.next != null && l2.next.next != null) {
            l1 = l1.next;
            l2 = l2.next.next;
            if (l1 == l2) {
                result = l1.next;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Leetcode142 leetcode142 = new Leetcode142();


        ListNode head =  new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4); 
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        System.out.println(leetcode142.detectCycle(head).val);
    }
}