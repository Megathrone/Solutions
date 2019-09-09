import java.util.HashSet;
import java.util.Set;

/**
 * ContainsDuplicateTwo
 *
 * 解题的关键是要maintain一个window，根据题目给的k值维护一个相同大小的窗口， 相当于固定游标卡尺在array移动
 */
public class ContainsDuplicateTwo {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // corner case
        if (nums == null || nums.length <= 1) {
            return false;
        }
        // Set + window
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
            // maintain window
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        // return
        return false;
    }
}