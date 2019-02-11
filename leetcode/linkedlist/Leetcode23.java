
public class Leetcode23 {

    public static void main(String[] args) {
       ListNode[] lists = new ListNode[3];
       ListNode head1 = new ListNode(1);
       ListNode node1 = new ListNode(4);
       ListNode node2 = new ListNode(5);
       head1.next = node1;
       node1.next = node2;

       ListNode head2 = new ListNode(1);
       ListNode node3 = new ListNode(3);
       ListNode node4 = new ListNode(4);
       head2.next = node3;
       node3.next = node4;


       ListNode head3 = new ListNode(2);
       ListNode node5 = new ListNode(6);
       head3.next = node5;

       lists[0] = head1;
       lists[1] = head2;
       lists[2] = head3;

       Leetcode23 leetcode23 = new Leetcode23();
       ListNode head = leetcode23.mergeKLists(lists);

       while (head != null) {
           System.out.println(head.val);
           head = head .next;
       }

    }
    public ListNode mergeKLists(ListNode[] lists) {
        return merge(lists, 0, lists.length - 1);
    }


    private ListNode merge(ListNode[] lists, int begin, int end) {
        if (begin < end) {
            int mid = (begin + end) / 2;
            ListNode head1 = merge(lists, begin, mid);
            ListNode head2 = merge(lists, mid + 1, end);

            ListNode newNode = null;
            if (head1 == null) {
                return head2;
            }
            if (head2 == null) {
                return head1;
            }
            if (head1.val > head2.val) {
                newNode = new ListNode(head2.val);
                head2 = head2.next;
            } else {
                newNode = new ListNode(head1.val);
                head1 = head1.next;
            }
            ListNode tmp = newNode;

            while (head1 != null && head2 != null) {
                if (head1.val > head2.val) {
                    tmp.next = new ListNode(head2.val);
                    head2 = head2.next;
                } else {
                    tmp.next = new ListNode(head1.val);
                    head1 = head1.next;
                }
                tmp = tmp.next;
            }

            if (head1 != null) {
                tmp.next = head1;
            } else {
                tmp.next = head2;
            }
            return newNode;
        } else if (begin == end) {
            return lists[begin];
        } else {
            return null;
        }
    }
}