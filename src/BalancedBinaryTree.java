/**
 * BalancedBinaryTree
 */
public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int leftDepth = dfs(root.left);
        int rightDepth = def(root.right);

        if (Math.abs(leftDepth - rightDepth) > 1) {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);

    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return Math.max(dfs(node.left), dfs(node.right)) + 1;
        }

    }
}