/**
 * PathSum
 */
public class PathSum {
    //思路是用总数sum减去每一个结点的值，如果有一个结点减完等于0且这个结点是叶子结点那么就返回true，所以根据
    //二叉树的思路，（考虑一下斐波那契数列，每一个case到最后都会遍历每一个路径），使用递归完成
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;

        if (root.left == null && root.right == null && (sum - root.val) == 0)
            return true;

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}