
/**
 * Leetcode143
 */
public class Leetcode143 {

    public void reorderList(ListNode head) {
        ListNode middle = null;
        ListNode p1 = null;
        middle = head;
        p1 = head;
        while(p1.next != null && p1.next.next != null) {
            middle = middle.next;
            p1 = p1.next.next;
        }

        ListNode curNode = middle.next;
        ListNode p2 = middle.next.next;
        while(curNode != null) {
            
        }
        

    }
    
    public static void main(String[] args) {
        Leetcode143 leetcode143 = new Leetcode143();

        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        ListNode result = leetcode143.reorderList(head);

        ListNode index = result;
        while (index != null) {
            System.out.println(index.val);
            index = index.next;
        }
    }
}