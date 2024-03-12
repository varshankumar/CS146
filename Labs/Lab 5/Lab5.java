package lab5;

public class Lab5 {

	public boolean isValidBST(TreeNode root) {
		return isValidSubtree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		
	 }
	
	
	public boolean isValidSubtree(TreeNode root, int min, int max) {
		if(root==null) return true;
		
		if(root.val<=min || root.val>=max) return false;
		
		return isValidSubtree(root.left, min, root.val) && 
				isValidSubtree(root.right, root.val, max);

	}
	
}
