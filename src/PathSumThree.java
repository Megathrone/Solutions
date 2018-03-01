import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/**
 * PathSumThree
 * 
 * 总结一下，pathsum这集个题应该都是DFS解了，也没有多难，主要是理解分治法的思想
 * 这里要注意的是 pathSum 和 pathSumFrom，public里面调用pathSum是因为要去除root结点，将子节点作为新的root结点
 * 
 * 那么递归类的问题就有一个模板，就是考虑base case，处理base case然后直接递归就行
 */
public class PathSumThree {
    
    public int pathSum(TreeNode root,int sum){
       // DFS
        if(root==null) return 0;
        return pathSumFrom(root,sum) + pathSum(root.left, sum)+pathSum(root.right, sum);
    }

    private int pathSumFrom(TreeNode node, int sum){
        if(node == null) return 0;
        return (node.val == sum ? 1:0) + pathSumFrom(root.left, sum-node.val) + pathSumFrom(root.right, sum-node.val);
    }
    
}