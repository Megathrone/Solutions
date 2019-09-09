import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/**
 * InOrderTraversal 遍历到最左边是第一个要输出的子节点，也就是说当p没有left的时候的那个结点是第一个
 */
public class InOrderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode p = root;
        while (p != null || !s.isEmpty()) {
            while (p != null) {
                s.push(p);
                p = p.left;
            }
            p = s.pop();
            res.add(p.val);
            p = p.right;
        }
        return res;

    }
}