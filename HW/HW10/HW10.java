package hw10;
import java.util.*;

public class HW10 {
	Queue <TreeNode> queue = new LinkedList<>();
	List<List<Integer>> result = new ArrayList<>();
	public List<List<Integer>> levelOrder(TreeNode root) {
	       // Your code here
		if(root == null) return null;
		queue.add(root);
		while(!queue.isEmpty()) {
			ArrayList<Integer> level = new ArrayList<Integer>();
			int queueSize = queue.size();
			for (int i = 0; i < queueSize; i++) {
				TreeNode node = queue.poll();
				level.add(node.val);
				if (node.left != null)
					queue.add(node.left);
				if (node.right != null)
					queue.add(node.right);
				
			}
			result.add(level);

		}
		
		return result;
			
			 
	    }

	
	public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3, node1, null);
        TreeNode node5 = new TreeNode(5);
        TreeNode node9 = new TreeNode(9);
        TreeNode node8 = new TreeNode(8, node5, node9);
        TreeNode root = new TreeNode(4, node3, node8);
        
        System.out.println(new HW10().levelOrder(root));

    }
}
