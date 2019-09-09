/**
 * FindPivotIndex 就是个简单的两头遍历没什么说的
 */
public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        if (null == nums) {
            return -1;
        }

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int sum = 0;
            int sum2 = 0;
            for (int k = 0; k < i; k++) {

                sum += nums[k];
            }
            for (int k = nums.length - 1; k > i; k--) {

                sum2 += nums[k];
            }
            if (sum == sum2) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, -1, -1, 0, 1, 1};
        FindPivotIndex foo = new FindPivotIndex();
        System.out.println(foo.pivotIndex(nums));
    }

}