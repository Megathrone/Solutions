import java.awt.List;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/**
 * LevelOrderPath2a 这道题要求的是反向输出二叉树的level order travsersal 那么就可以利用LinkedList的addFirst这个函数添加，每次都添加到头部
 */
public class LevelOrderPath2 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> queue = new Queue<>();
        if (root != null) {
            queue.offer(root);
        }

        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<>();

            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                subList.add(queue.poll().val);
            }

            res.addFirst(subList);
        }
        return res;
    }
}