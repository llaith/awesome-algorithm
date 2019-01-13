import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Stack;

/**
 * Leetcode145
 */
public class Leetcode145 {


    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        
        Map<TreeNode, Integer> vistedNode = new HashMap<>();
        if (root == null) {
            return result;
        }
        stack.push(root);
        while(!stack.empty()) {
            TreeNode currentNode = stack.peek();
            if (currentNode.left == null && currentNode.right == null) {
                result.add(currentNode.val);
                vistedNode.put(currentNode, 1);
                stack.pop();
                continue;
            } else if(!((currentNode.left != null && vistedNode.get(currentNode.left) == null) || (currentNode.right != null && vistedNode.get(currentNode.right) == null))) {
                result.add(currentNode.val);
                stack.pop();
                vistedNode.put(currentNode, 1);
                continue;
            } 
            
            if (currentNode.left != null && vistedNode.get(currentNode.left) == null) {
                while(currentNode.left != null && vistedNode.get(currentNode.left) == null) {
                    stack.push(currentNode.left);
                    currentNode = currentNode.left;
                }
            }
            
            if (currentNode.right != null && vistedNode.get(currentNode.right) == null) {
                stack.push(currentNode.right);
            } 
        }

        return result;
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