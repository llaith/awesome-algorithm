
/**
 * Leetcode111
 */
public class Leetcode111 {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        if (leftDepth == 0 || rightDepth == 0) {
            return leftDepth + rightDepth + 1;
        }

        return Math.min(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        Leetcode111 leetcode111 = new Leetcode111();
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        root.left = node1;

        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        System.out.println(leetcode111.minDepth(root));
    }
}