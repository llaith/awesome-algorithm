package leetcode;

public class Leetcode104 {

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
        if (root.left == null && root.right == null) {
        	return 1;
        } 
        int left = 0;
        int right = 0;
        
        if(root.left != null) {
        	left = maxDepth(root.left) + 1;
        } 
        if (root.right != null) {
        	right = maxDepth(root.right) + 1;
        }
        
        return left > right ? left : right; 
    }
	
	public static void main(String[] args) {
		Leetcode104 leetcode104 = new Leetcode104();

		TreeNode root = new TreeNode(3);
		TreeNode node1 = new TreeNode(9);
		TreeNode node2 = new TreeNode(20);
		TreeNode node3 = new TreeNode(15);
		TreeNode node4 = new TreeNode(7);
		
		root.left = node1;
		root.right = node2;
		
		node2.left = node3;
		node2.right = node4;
		
		System.out.println(leetcode104.maxDepth(root));
	}
}
