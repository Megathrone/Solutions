import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/**
 * MinimumDepthofTree
 * 
 * 还是一个经典的BFS问题，第一个解用了递归，不难理解，if里面是分成了左子树和右子树，找到最小加上根节点的1就是最小层数
 * else是当左或右没有子树的时候选择某一边进行遍历，但是我们怎么知道哪一边是null呢，所以else里用max来获取某一边
 * 但是吧。。。这个方法我感觉不是很合适，因为如果左子树特别深，那么这个递归要一直遍历到最深的结点，因为你要用min来判断的呀，
 * 所以在写一个常规的BFS秒了 = =
 */
public class MinimumDepthofTree {
    /* Recursion, which is not effctive.
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left != null && root.right != null)
            return Math.min(minDepth(root.left), minDepth(root.right))+1;
        else
            return Math.max(minDepth(root.left), minDepth(root.right))+1;
    }
    
    */
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int depth = 0;
        while (!q.isEmpty()) {
            depth++;
            for (int i = 0; i < q.size(); i++) {
                TreeNode p = q.remove();
                if (p.left != null)
                    q.offer(p.left);
                if (p.right != null)
                    q.offer(p.right);
                if (p.left == null && p.right == null)
                    return depth;
            }
        }
        return -1;
    }

}