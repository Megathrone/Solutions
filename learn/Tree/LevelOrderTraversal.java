import java.util.LinkedList;
import java.util.List;
import java.util.Queue;




/**
 * @author:Megathrone
 * LevelOrderTraversal
 *
 * 使用 BFS 来进行遍历，用队列的数据结构完成遍历。
 * 
 */
public class LevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        
        if(root!=null) q.offer(root);

        while(!q.isEmpty()){
            // 这个levelNum的作用是更新目前队列里面欧多少个元素，而这个元素的数量也就是这一层的子节点数量，
            // 因为后面要哟结果poll方法取出
            int levelNum=q.size();
            List<Integer> subList = new LinkedList<>();
            for (int i = 0; i < levelNum; i++) {
                if(q.peek().left!=null) q.offer(q.peek().left);
                if(q.peek().right!=null) q.offer(q.peek().right);
                subList.add(q.poll().val);
            }
            res.add(subList);
        }
        return res;
    }
}