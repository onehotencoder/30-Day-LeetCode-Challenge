public class Day11DiameterOfBinaryTree {

	int dr = 0;

	public int diameterOfBinaryTree(TreeNode root) {
		maxPathNodes(root);
		return dr;
	}

	public int maxPathNodes(TreeNode root) {
		if (root == null)
			return 0;
		int leftDepth = maxPathNodes(root.left);
		int rightDepth = maxPathNodes(root.right);
		dr = Math.max(dr, leftDepth + rightDepth);
		return 1 + Math.max(leftDepth, rightDepth);
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}