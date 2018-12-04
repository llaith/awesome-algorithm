
/**
 * Leetcode25
 */
public class Leetcode25 {

    public ListNode reverseKGroup(ListNode head, int k) {

        if(k == 1) {
            return head;
        }

        ListNode guard = new ListNode(0); // 哨兵
        guard.next = head;
        ListNode current = guard;
        ListNode kend = current;
        ListNode next = null;
        int index = k;

        while(index >=0 && kend != null) {
            if(index == 0) {
                next = kend.next;
                kend.next = null;
                current.next  = reverseList(current.next);
                kend = current.next;
                while(kend.next != null) {
                    kend = kend.next;
                    if(kend.next == null) {
                        current = kend;
                    }
                }
                kend.next = next;
                index = k;
            } else {
                index--;
                kend = kend.next;
            }
        }
        
        return guard.next;
    }


    
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
        
        Leetcode25 leetcode25 = new Leetcode25();
        ListNode node1 = leetcode25.new ListNode(1);
        ListNode node2 = leetcode25.new ListNode(2);
        ListNode node3 = leetcode25.new ListNode(3);
        ListNode node4 = leetcode25.new ListNode(4);
        ListNode node5 = leetcode25.new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode head = leetcode25.reverseKGroup(node1, 1);

        leetcode25.printNode(head);
    }

    private void printNode(ListNode head) {
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
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