import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.tree.TreeNode;

/**
 * FindDuplicateSubtrees
 * 
 * 这是一个二叉树遍历和HashMao结合的题
 * 首先遍历每一个结点的子树，这里要做的操作是把子树整体序列化成一个String字符串，然后存入HashMap
 * 如果遍历到某一个结点的时候发现了相同的序列说明是相同的子树
 * 序列使用先序遍历，然后存入hashmap，然后就是常规的查重操作了
 */
public class FindDuplicateSubtrees {
    Map<String, TreeNode> map = new HashMap<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new ArrayList<>();
        if (null == root)
            return res;

        traversal(init(root));
        
        for (TreeNode node : map.values()) {
            if (null != node)
                res.add(node);
        }
        return res;
    }

    private TreeNode init(TreeNode node) {
        if (null == node)
            return null;
        if (node.left != null && node.right != null)
            return node;
        if (node.left != null)
            return init(node.left);
        return init(node.rigth);
    }

    private void traversal(TreeNode node) {
        if (null == node)
            return;

        String s = serial(node);
        if (map.containsKey(s)) {
            map.put(s, node);
        } else {
            map.put(s, null);
        }

        traversal(node.left);
        traversal(node.right);
    }

    private String serial(TreeNode node) {
        if (null == node)
            return "#";
        String str = node.val + "." + serial(node.left) + "." + serial(node.right);
        return str;
    }
}