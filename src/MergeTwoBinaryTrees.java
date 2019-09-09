/**
 * MergeTwoBinaryTrees
 */
public class MergeTwoBinaryTrees {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (null == t1) {
            return t2;
        }
        if (null == t2) {
            return t1;
        }

        TreeNode ans = new TreeNode(t1.val + t2.val);
        ans.left = mergeTrees(t1.left, t2.left);
        ans.right = mergeTrees(t1.right, t2.right);

        return ans;
    }
}