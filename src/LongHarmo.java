import java.util.HashMap;
import java.util.Hashtable;

public class LongHarmo {

    public int findLHS(int[] nums) {
        HashMap<Long, Integer> map = new HashMap<>();
        for (long num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        for (long key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                res = Math.max(res, map.get(key + 1) + map.get(key));
            }
        }
        return res;
    }


    public static void main(String[] argv) {
        int[] nums = new int[]{1, 3, 2, 2, 5, 2, 3, 7};
        System.out.println((new LongHarmo()).findLHS(nums));
    }
}
