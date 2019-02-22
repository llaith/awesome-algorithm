
public class Leetcode226 {

	public TreeNode invertTree(TreeNode root) {
		invertNodeRe(root);
		return root;
    }
	
	
	public void invertNodeRe(TreeNode root) {
		
		if (root == null) {
			return;
		}
		TreeNode tmpNode = root.left;
		
		root.left = root.right;
		root.right = tmpNode;
		
		if (root.left != null) {
			invertNodeRe(root.left);
		}
		
		if (root.right != null) {
			invertNodeRe(root.right);
		}
	}
	
	public static void main(String[] args) {
		Leetcode226 leetcode226 = new Leetcode226();
		
		TreeNode root = new TreeNode(4);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(7);
		TreeNode node3 = new TreeNode(1);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(6);
		TreeNode node6 = new TreeNode(9);
		
		root.left = node1;
		root.right = node2;
		
		node1.left = node3;
		node1.right = node4;
		
		node2.left =  node5;
		node2.right = node6;
		
		leetcode226.printTree(root);
		root = leetcode226.invertTree(root);		
		leetcode226.printTree(root);
	}
	
	
	public void printTree (TreeNode root) {
		System.out.println(root.val);
		if (root.left != null) {
			printTree(root.left);
		}
		if (root.right != null) {
			printTree(root.right);
		}
	}
}
