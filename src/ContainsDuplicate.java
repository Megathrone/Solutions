import java.util.HashSet;
import java.util.Set;

/**
 * ContainsDuplicate
 * 
 * 这个题不是很难，首先判断有没有重复可以想到用set，
 * 如果set执行完add之后的size也就是长度小于元数组的长度的话
 * 说明又重复，因为set是自动去重的，所以就很简单判断了
 */
public class ContainsDuplicate {


    public boolean containsDuplicate(int[] nums) {
        int numsLen = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        if (numsLen > set.size()) {
            return false;
        }else{
            return true;
        }

    }
}