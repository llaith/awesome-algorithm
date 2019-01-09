import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Leetcode144
 */
public class Leetcode144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();

        if (root == null) {
            return result;
        }
        stack.push(root);

        while (!stack.empty()) {
            TreeNode currentNode = stack.pop();
            if (currentNode != null) {
                result.add(currentNode.val);
                stack.push(currentNode.right);
                stack.push(currentNode.left);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Leetcode144 leetcode144 = new Leetcode144();

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);

        root.right = node1;
        node1.left = node2;

        List<Integer> result = leetcode144.preorderTraversal(root);

        for (Integer i : result) {
            System.out.println(i);
        }

    }
}