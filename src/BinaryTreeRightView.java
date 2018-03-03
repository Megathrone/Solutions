import java.util.*;

import javax.swing.tree.TreeNode;

/**
 * BinaryTreeRightView
 * 假设你站在二叉树的右边，然后返回你看到的一组数，就是说要返回每一层最右边的结点
 * 又是标准且经典的BFS题，直接秒了，
 * 需要判断一个就是你怎么知道当前这个p就是最右边了呢，可以这样：
 * q.siez()是这一层的个数，最右边的时候就是倒数第二个等于size-1对不对，那不就完了
 * 
 * 一个心得，我发现BFS的题都是设置条件，本身level traversal并不难，可能在想条件的时候要好主意
 */
public class BinaryTreeRightView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root == null)
            return res;

        q.offer(root);

        while (!q.isEmpty()) {
            int levelNum = q.size();
            for (int i = 0; i < levelNum; i++) {
                TreeNode p = q.remove();
                if (i == levelNum - 1)
                    res.add(p.val);
                if (p.left != null)
                    q.offer(p.left);
                if (p.right != null)
                    q.offer(p.right);
            }
        }
        return res;
    }
}