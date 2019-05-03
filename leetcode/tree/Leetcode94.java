public class Leetcode94 {
     public List<Integer> inorderTraversal(TreeNode root) {
	     List<Integer> result = new ArrayList<Integer>();
	     
	     if (root == null) {
	    	 return result;
	     }
	     
	     Stack<TreeNode> stack = new Stack<TreeNode>();
	     stack.push(root);
	     
	     TreeNode tmp = stack.pop();
	     while (tmp != null || !stack.empty()) {
	    	 
	    	 while (tmp != null) {
	    		stack.push(tmp);
	    		tmp = tmp.left;
	    	 }
	    	 tmp = stack.pop();
	    	 result.add(tmp.val);
	    	 tmp = tmp.right;
	     }
	     
		 return result;
	 }
	 
	public static void main(String[] args) {
		Leetcode94 leetcode94 = new Leetcode94();
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		root.right = node1;
		node1.left = node2;
		
		List<Integer> result = leetcode94.inorderTraversal(root);
		
		for (Integer integer : result) {
			System.out.print(integer+" ");
		}
	}
}