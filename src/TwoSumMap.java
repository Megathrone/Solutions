import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * TwoSumMap
 */
public class TwoSumMap {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] defaultAns = {0, 0};
        int lenght = nums.length;

        for (int i = 0; i < lenght; i++) {
            if (map.get(target - nums[i]) != null) {
                int[] ans = {map.get(target - nums[i]), i};
                return ans;
            }

            map.put(nums[i], i);
        }
        return defaultAns;

    }

    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        int target = 9;
        TwoSumMap foo = new TwoSumMap();
        System.out.println(Arrays.toString(foo.twoSum(a, target)));
    }
}