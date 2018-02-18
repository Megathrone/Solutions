/**
 *
 *
 *递归方法:左等于中间, 右边等于左边,右边等于中间
 *
 *@NogizakaZZ
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode ( int x ) {
        val = x;
    }
}

public class InvertBinaryTree {
    public TreeNode invertTree ( TreeNode root ) {
        if(root==null){
            return null;
        }
        TreeNode temp;

        if((root.left==null)&&(root.right==null)){
            return root;
        }
        temp=root.left;
        root.left=root.right;
        root.right=temp;
        invertTree( root.left );
        invertTree( root.right );

        return root;

    }
}
