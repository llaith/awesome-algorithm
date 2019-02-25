import java.util.Stack;

public class Leetcode98 {

	public boolean isValidBST(TreeNode root) {
		if (root == null) {
			return true;
		}
		
		double inorder = -Double.MAX_VALUE;
		
		Stack<TreeNode> stack = new Stack<>();
        
        TreeNode currentNode = root;

        while (currentNode != null || !stack.empty()) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stack.pop();
            if (currentNode.val <= inorder) {
            	return false;
            }
            inorder = currentNode.val;
            currentNode = currentNode.right;
        }
			
		return true;
    }
	
	
	public static void main(String[] args) {
		Leetcode98 leetcode98 = new Leetcode98();
		
		TreeNode root = new TreeNode(5);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(4);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(6);
		root.left = node1;
		root.right = node2;
		node2.left = node3;
		node2.right = node4;
		
		System.out.println(leetcode98.isValidBST(root));
	}
	
}
