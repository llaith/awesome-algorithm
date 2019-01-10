
/**
 * Leetcode147
 */
public class Leetcode147 {

    public ListNode insertionSortList(ListNode head) {
        ListNode p = new ListNode(Integer.MIN_VALUE);
        p.next = head;
        head = p;

        ListNode begin = head; // 有序序列的开头
        ListNode index = head; // 有序序列的结尾
        p = head.next;
        while (p != null) {
            ListNode i = head;
            // 在没有遍历到有序序列结尾的情况下继续比较
            while (i != index && begin.next != null) {
                if (p.val < begin.next.val) { // 找到位置，插入
                    index.next = p.next;
                    p.next = begin.next;
                    begin.next = p;
                    p = index.next;
                    begin = head;
                    break;
                } else { // 没有找到位置，继续遍历
                    begin = begin.next;
                    i = i.next;
                }
            }
            if (i == index) {
                p = p.next;
                index = index.next;
                begin = head;
            }
        }
        return head.next;
    }
    

    public static void main(String[] args) {
        Leetcode147 leetcode147 = new Leetcode147();

        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(1);
        /*
        ListNode head = new ListNode(4);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(3);
        */
        /*
        ListNode head = new ListNode(-1);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(0);
        */
        head.next = node2;
        node2.next = node3;
        /*
        node3.next = node4;
        node4.next = node5;
        */
        head = leetcode147.insertionSortList(head);
        
        ListNode p = head;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}