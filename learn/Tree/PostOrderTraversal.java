import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


/**
 * PostOrderTraversal 核心思路就是反过来输出，因为是左右中的方式进行遍历所以在压入stack的时候从左至右，这样 弹出的时候就是右边先出来那么就符合后序遍历的顺序了，
 * 这里注意一个数据结构的用法，用的是Linkedlist，可以addFirst把数据放在最前面。
 */
public class PostOrderTraversal {
    // This is a recursive solution.

    // List<Integer> res = new ArrayList<>();

    // public List<Integer> postorderTraversal(TreeNode root) {
    // if(root!=null){
    // postorderTraversal(root.left);
    // postorderTraversal(root.right);
    // res.add(root.val);
    // }
    // return res;
    // }

    // non-recursive
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        Stack<TreeNode> s = new Stack<>();

        s.push(root);
        while (!s.isEmpty()) {
            TreeNode curr = s.pop();
            res.addFirst(curr.val);
            if (curr.left != null)
                s.push(curr.left);
            if (curr.right != null)
                s.push(curr.right);
        }
        return res;

    }
}
