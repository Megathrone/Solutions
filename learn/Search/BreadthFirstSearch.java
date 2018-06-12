import java.util.*;

/**
 * BreadthFirstSearch
 */

public class BreadthFirstSearch {

    private boolean[] marked;
    private int[] edgeTo;
    private final int s;

    public BreadthFirstSearch(Graph g, int s) {
        marked = new boolean[g.V()];
        edgeTo = new int[g.V()];
        this.s = s;
        bfs(g, s);
    }

    private void bfs(Graph g, int s) {
        Queue<Integer> queue = new Queue<>();
        marked[s] = true;
        queue.offer(s);

        while (!queue.isEmpty()) {
            int v = queue.remove();
            for (int w : g.adj(v)) {
                edgeTo[w] = v;
                marked[w] = true;
                queue.offer(w);
            }
        }
    }
}