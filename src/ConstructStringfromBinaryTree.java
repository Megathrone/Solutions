/**
 * 
 * 这个题首使用递归的思想来做，首先访问根节点然后左右，这是preorder traversal
 * 然后呢根绝题目的要求对字符串进行构造注意要把根节点放在最前面e
 */

public class ConstructStringfromBinaryTree {
    public String tree2str(TreeNode t) {
        if (null == t)
            return "";

        String res = t.val + "";
        String left = tree2str(t.left);
        String right = tree2str(t.right);

        if (left == "" && right == "")
            return res;
        if (left == "")
            return res + "()" + "(" + right + ")";
        if (right == "")
            return res + "(" + left + ")";
        return res + "(" + left + ")" + "(" + right + ")";

    }
}