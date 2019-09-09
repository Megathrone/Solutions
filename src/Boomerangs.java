import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Iruka on 2017/5/27.
 */
public class Boomerangs {

    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }

                int dis = getDis(points[i], points[j]);
                map.put(dis, map.getOrDefault(dis, 0) + 1);
            }
        }

        for (int value : map.values()) {
            res += value * (value - 1);
        }
        map.clear();
        return res;
    }

    private int getDis(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];

        return dx * dx + dy * dy;
    }


    public static void main(String[] args) {
        int[][] points = new int[][]{{1, 0}, {0, 0}, {2, 0}};
        System.out.println(new Boomerangs().numberOfBoomerangs(points));
    }
}
