import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * PerfectSquare
 */
public class PerfectSquare {

    public int numSquares(int n) {

        if (n <= 0) {
            return 0;
        }
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        int res = 0;

        queue.offer(n);
        while (!queue.isEmpty()) {
            int size = queue.size();
            res++;

            for (int i = 0; i < size; i++) {
                int code = queue.poll();
                if (visited.contains(code)) {
                    continue;
                }
                for (int k = 1; k <= Math.sqrt(code); k++) {

                    int diff = code - k * k;
                    if (diff == 0) {
                        return res;
                    }

                    queue.offer(diff);
                }
            }
        }
        return 0;
    }

}
