import java.util.*;

/**
 * 4SumTwo
 *
 * 分别计算AB的所有和，CD的可能和，如果CD算出来的负值等于AB的一个和，那么就 说明有一个答案 而map里有多少个这样的sum答案就加几个
 */
public class FourSumTwo {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < A.length; i++) {
            for (int k = 0; k < B.length; k++) {
                int sum = A[i] + B[k];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        for (int i = 0; i < C.length; i++) {
            for (int k = 0; k < D.length; k++) {
                int sum = -(C[i] + D[k]);
                if (map.containsKey(sum)) {
                    res += map.get(sum);
                }
            }
        }

        return res;
    }
}