import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class anagramMappings {

    public int[] anagramMapping(int[] A, int[] B) {
        int[] res = new int[A.length];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(B[i], i);
        }
        for (int i = 0; i < A.length; i++) {
            res[i] = map.get(A[i]);
        }
        System.out.println(Arrays.toString(res) + " " + map);
        return res;
    }

    public static void main(String[] args) {
        int[] a = new int[]{12, 28, 46, 32, 50, 50};
        int[] b = new int[]{50, 50, 12, 32, 46, 28};

        anagramMappings so = new anagramMappings();
        so.anagramMapping(a, b);

    }
}