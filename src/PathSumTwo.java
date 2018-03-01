import java.util.*;

/**
 * PathSumTwo
 * 
 * 这个事back tracking的技巧，每一次遍历到叶子结点后都删除最后一个结点
 * 也是一个dfs
 */
public class PathSumTwo {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        pathSum(root, sum, subList, res);
        return res;
    }

    public void pathSum(TreeNode node, int sum, List<Integer> subList, List<List<Integer>> res) {
        if (node == null)
            return;

        subList.add(node.val);
        if (node.left == null && node.right == null && sum == node.val) {
            res.add(new ArrayList(subList));
        } else {
            pathSum(node.left, sum - node.val, subList, res);
            pathSum(node.right, sum - node.val, subList, res);
        }
        subList.remove(subList.size() - 1);
    }
}