import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode145
 */
public class Leetcode145 {


    public List<Integer> postorderTraversal(TreeNode root) {

        
        while(true) {
            
            break;
        }

        return null;
    }
    

    /**
     * 递归方式
     * @param args
     */
    /*
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recursion(root, result);
        return result;
    }


    private void recursion(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        recursion(root.left, list);
        recursion(root.right, list);
        list.add(root.val);
    }*/

    public static void main(String[] args) {
        Leetcode145 leetcode145 = new Leetcode145();

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);

        root.right = node1;
        node1.left = node2;

        List<Integer> result = leetcode145.postorderTraversal(root);

        for (Integer i : result) {
            System.out.println(i);
        }

    }
}