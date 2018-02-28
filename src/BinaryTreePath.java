import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 
 * @author:Megathrone
 * BinaryTreePath
 * 
 * 用了一个BFS的方法
 */
public class BinaryTreePath {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        Queue<TreeNode> qNode = new LinkedList<>();
        Queue<String> qStr = new LinkedList<>();
        
        if (root == null)
            return res;

        qNode.offer(root);
        qStr.offer("");

        while (!qNode.isEmpty()) {
            TreeNode curNode = qNode.poll();
            String curStr = qStr.poll();

            if (curNode.left == null && curNode.right == null)
                res.add(curStr + curNode.val);

            if (curNode.left != null) {
                qNode.offer(curNode.left);
                qStr.offer(curStr + curNode.val + "->");
            }
            if (curNode.right != null) {
                qNode.offer(curNode.right);
                qStr.offer(curStr + curNode.val + "->");
            }
        }

        return res;
    }

}