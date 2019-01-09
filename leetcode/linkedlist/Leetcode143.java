
/**
 * Leetcode143
 */
public class Leetcode143 {

    public void reorderList(ListNode head) {
        ListNode temp1 = null;
        ListNode temp2 = null;
        temp1 = head;
        temp2 = temp1;
        while(temp2.next != null) {
            ListNode temp3 = temp2.next;
            temp1.next = null;
            temp2.next = temp1;
            temp1 = temp2;
            temp2 = temp3;
        }
        ListNode end = temp2;

        

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