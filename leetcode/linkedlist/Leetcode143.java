
/**
 * Leetcode143
 */
public class Leetcode143 {

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        } 
        ListNode middle = null;
        ListNode p1 = null;
        middle = head;
        p1 = head;
        while(p1.next != null && p1.next.next != null) {
            middle = middle.next;
            p1 = p1.next.next;
        }

        // 将链表的后半部分反转
        ListNode curNode = middle.next;
        ListNode p2 = curNode.next;
        curNode.next = null;
        while(p2 != null) {
            ListNode p3 = p2.next;
            p2.next = curNode;
            curNode = p2;
            p2 = p3;
        }
        middle.next = curNode;


        // 将两部分的连接重新组合
        ListNode p4 = head;
        ListNode p5 = middle.next;
        middle.next = null;
        while(p4 != null && p5 != null) {
            ListNode p6 = p5.next;
            p5.next = p4.next;
            p4.next = p5;
            p5 = p6;
            p4 = p4.next.next;
        }

    }
    
    public static void main(String[] args) {
        Leetcode143 leetcode143 = new Leetcode143();

        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        

        leetcode143.reorderList(head);

        ListNode index = head;
        while (index != null) {
            System.out.println(index.val);
            index = index.next;
        }
    }
}