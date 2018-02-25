
import java.util.*;

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * 
 * @Megathrone
 * two solutions, the first one is recursion and the second is iteration.
 * 两种解法，一种是递归的比较简单，另一种是stack，首先吧root压入栈，然后弹出判空压入值，之后因为
 * stack的pop顺序问题先压root的right再left
 */
public class PreOrderTraversal {
    /** Recursion

    List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root != null) {
            list.add(root.val);
            preorderTraversal(root.right);
            preorderTraversal(root.left);
        }
        return res;
    }
    */
    //Iteration
    public List<Integer> preorderTraversal(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        if(root!=null) stack.push(root);
        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            list.add(curr.val);
            if(curr.right!=null) stack.push(curr.right);
            if(curr.left!=null) stack.push(curr.left);
        }
        return list;
    }


}