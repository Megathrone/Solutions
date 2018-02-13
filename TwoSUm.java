/**
 *
 *
 * 就是双循环比如a[0]+a[1-length]然后a[1]+a[2=length],有点像冒泡排序
 * @NogizakaZ
 */
public class TwoSUm {
    public int[] twoSum ( int[] nums, int target ) {
        int[] out = new int[2];
        for ( int i = 0 ; i < nums.length ; i++ ) {
            for ( int m = i + 1 ; m < nums.length ; m++ ) {
                if ( (nums[i] + nums[m]) == target ) {
                    out[0] = i;
                    out[1] = m;
                }
            }
        }
        return out;
    }
}
