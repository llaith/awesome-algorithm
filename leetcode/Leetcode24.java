
/**
 * Leetcode24
 */
public class Leetcode24 {

    public ListNode swapPairs(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode current = head;
        ListNode next = current.next;
        if(next == null) {
            return head;
        }

        // 处理头节点
        current.next = next.next;
        next.next = current;
        head = next;
        ListNode prev = current;
        current = current.next;
        if(current != null) {
            next = current.next;
        }

        while(current != null && next != null) {
            current.next = next.next;
            next.next = current;
            prev.next = next;
            prev = current;
            current = current.next;
            if(current != null) {
                next = current.next;
            }
        }
        
        return head;
    }
    

    public static void main(String[] args) {
        Leetcode24 leetcode24 = new Leetcode24();
        ListNode node1 = leetcode24.new ListNode(1);
        ListNode node2 = leetcode24.new ListNode(2);
        ListNode node3 = leetcode24.new ListNode(3);
        ListNode node4 = leetcode24.new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        
        ListNode result = leetcode24.swapPairs(node1);

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