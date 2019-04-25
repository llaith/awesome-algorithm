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

    /**
     * 中序遍历
     * @param root
     */
    public void inOrder(TreeNode root) {
        
        Stack<TreeNode> stack = new Stack<>();
        
        if (root == null) {
            return;
        }
        TreeNode currentNode = root;

        while (currentNode != null || !stack.empty()) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            if (!stack.empty()) {
                currentNode = stack.pop();
                System.out.print(currentNode.val + " ");
                currentNode = currentNode.right;
            }
        }
    }


    /**
     * 后续遍历
     * @param root
     */
    public void postOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();

        if (root == null) {
            return;
        }

    }


    /**
     * 按层遍历
     * @param node
     */
    public void levelOrder(TreeNode node) {

    }

}