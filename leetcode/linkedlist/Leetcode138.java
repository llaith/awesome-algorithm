import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode138
 */
public class Leetcode138 {

    public RandomListNode copyRandomList(RandomListNode head) {
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        for (RandomListNode cur = head; cur != null; cur = cur.next) {
            map.put(cur, new RandomListNode(cur.label));
        }

        for (RandomListNode cur = head; cur != null; cur = cur.next) {
            RandomListNode copy = map.get(cur);
            copy.next = cur.next == null ? null : map.get(cur.next);
            copy.random = cur.random == null ? null : map.get(cur.random);
        }
        return map.get(head);
    }

    public static void main(String[] args) {
        Leetcode138 leetcode138 = new Leetcode138();
        RandomListNode head = new RandomListNode(1);
        RandomListNode node1 = new RandomListNode(2);
        head.next = node1;

        leetcode138.copyRandomList(head);
    }
}