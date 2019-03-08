
public class LeetCode108 {

	public TreeNode sortedArrayToBST(int[] nums) {
		return recursion(nums, 0, nums.length -1);
    }
	
	private TreeNode recursion(int[] nums, int left, int right) {
		if (left > right) {
			return null;
		}		
		int middle = left + (right - left) / 2;
		TreeNode head = new TreeNode(nums[middle]);
		head.left = recursion(nums, left, middle - 1);
		head.right = recursion(nums, middle + 1, right);
		return head;
	}
	
	
	public static void main(String[] args) {
		LeetCode108 leetCode108 = new LeetCode108();
		leetCode108.print(leetCode108.sortedArrayToBST(new int[]{-10,-3,0,5,9}));
	}
	
	public void print(TreeNode node) {
		if (node == null) {
			return;
		}
		System.out.println(node.val);
		print(node.left);
		print(node.right);
	}
}
