import java.util.Queue;
import javafx.scene.Node;

class BFS {
    public int _BFS(Node root, Node target) {
        Queue<Node> queue;
        int setp = 0;

        // inititalize
        // add root to queue

        // BFS
        while (!queue.isEmpty()) {
            step = step + 1;
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                Node curr = queue.peek();
                if (curr == target) {
                    return curr.val;
                }
                for (Node next : neighbour(curr)) {
                    queue.offer(next);
                }
                queue.remove();
            }
        }

        return -1;
    }
}
