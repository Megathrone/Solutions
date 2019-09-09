import java.util.*;

import javax.swing.tree.TreeNode;

/**
 * SecondMinimum
 *
 * 一个心得，真的要仔细看题目说明啊，题目说了根节点的值小于两个子节点的值，也就是说每一次的root都是最小的， 那么就很简单了，BFS秒了，当然也可以DFS
 */
public class SecondMinimum {

    //bfs
    /*
    public int findSecondMinimumValue(TreeNode root) {
        int min = Integer.MAX_VALUE;

        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null) return -1;

        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode p = queue.remove();
            if(p.val>root.val && p.val<min) minm = p.val;
            if(p.left!=null) queue.offer(p.left);
            if(p.right!=right) queue.offer(p.right);
        }


        return (min == Integer.MAX_VALUE) ? -1 : min;
    }
    */
    // DFS
    int minVal;
    int secondMin = Integer.MAX_VALUE;

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }
        minVal = root.val;
        dfs(root);
        return secondMin == Integer.MAX_VALUE ? -1 : secondMin;
    }

    private void dfs(TreeNode node) {
        if (node.val != minVal) {
            secondMin = Math.min(secondMin, node.val);
        }
        if (node.left != null) {
            dfs(node.left);
        }
        if (node.right != null) {
            dfs(node.right);
        }
    }
}