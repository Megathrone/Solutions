/**
 * ConFromInAndPost
 */
public class ConFromInAndPost {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, inorder.length - 1, 0, postorder, postorder.length - 1);
    }

    private TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder,
        int postStart) {
        if (inStart < inEnd || postStart < 0) {
            return null;
        }

        //后序遍历的最后一个元素是根节点
        TreeNode root = new TreeNode(postorder[postStart]);

        //中序遍历里面找到根节点，并记录根节点的下表，并把数组根据根节点位置分成两个部分
        //（这里再一次的体现了二分的思路，斐波那契数列,分左右）
        int indexRoot = inStart;
        for (int i = indexRoot; i >= inEnd; i--) {
            if (inorder[i] == postorder[postStart]) {
                indexRoot = i;
                break;
            }
        }

        root.right = buildTree(inorder, inStart, indexRoot + 1, postorder, postStart - 1);
        root.left = buildTree(inorder, indexRoot - 1, inEnd, postorder,
            postStart - (inStart - indexRoot) - 1);
        return root;
    }
}