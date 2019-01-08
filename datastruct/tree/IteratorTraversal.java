import java.util.Stack;

/**
 * IteratorTraversal
 */
public class IteratorTraversal {

    /**
     * 前序遍历
     * @param root
     */
    public void preOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return;
        }
        stack.push(root);
        while (!stack.empty()) {
            TreeNode currentNode = stack.pop();
            if (currentNode != null) {
                System.out.print(currentNode.val + " ");
                stack.push(currentNode.right);
                stack.push(currentNode.left);
            }
        }
    }

    
}