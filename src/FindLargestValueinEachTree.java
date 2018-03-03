
import java.util.*;

import javax.swing.tree.TreeNode;

/**
 * FindLargestValueinEachTree
 * 找到每一层之中最大的值，这一是个最经典的BFS题，直接常规模板BFS秒了
 * 就是一个心得。。。记得用Math库，不要自己写了 = =
 */
public class FindLargestValueinEachTree {

    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();

        if (root == null)
            return res;
        q.offer(root);

        while (!q.isEmpty()) {

            int levelNum = q.size();
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < levelNum; i++) {
                TreeNode p = q.poll();

                if (p.left != null)
                    q.offer(p.left);
                if (p.right != null)
                    q.offer(p.right);
                max = Math.max(p.val, max);
            }
            res.add(max);

        }

        return res;

    }
}