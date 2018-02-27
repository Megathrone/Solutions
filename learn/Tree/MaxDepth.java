/**
 * MaxDepth
 */
public class MaxDepth {
    public int maxDepth(TreeNode root){
        // top-down
        if(root==null) return 0;

        int leftDepth,rightDepth;
        leftDepth = maxDepth(root.left);
        rightDepth = maxDepth(root.right);

        return Math.max(leftDepth,rightDepth)+1;

    }

   
}