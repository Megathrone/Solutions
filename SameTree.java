/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 *
 *
 * 两棵树完全相等是说每个孩子结点的值也要相等,所以用递归的方法是坠吼的,（貌似关于树的题用递归都不错）,所以首先考虑空
 * 的情况,然后直接返回:如果结点值相同,结点左孩子右孩子的值也都相同且存在,则完全相同
 *
 * @NogizakaZ
 */
public class SameTree {
    public boolean isSameTree ( TreeNode p, TreeNode q ) {
        if ( p == null || q == null ) {
            return false;
        }
        if ( p == null && q == null ) {
            return true;
        }
        return p.val == q.val &&
                isSameTree( p.left, q.left ) &&
                isSameTree( p.right, q.right );


    }
}
