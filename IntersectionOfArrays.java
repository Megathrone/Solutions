import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

/**
 *
 *
 * 用Hashset,因为不能重复加入相同的值,所以将nums1全部加入set,然后遍历nums2如果nums1中有的话加入输出数组
 * @NogizakaZ
 */
public class IntersectionOfArrays {
    public int[] intersection ( int[] nums1, int[] nums2 ) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                intersect.add(nums2[i]);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer j : intersect) {
            result[i++] = j;
        }
        return result;

    }

}
