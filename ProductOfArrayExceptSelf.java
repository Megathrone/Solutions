import java.util.Arrays;
import java.util.HashSet;

/**
 * 。。。。。首先,从计算每个位置左边所有数字的积。然后从右边进行同样的动作。
 *
 * @NogizakaZ
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf ( int[] nums ) {
        HashSet<Integer> ar1 = new HashSet<Integer>();
        for ( int n : nums ) {
            if ( ar1. ) {
                Arrays.fill( nums, 0 );
                return nums;
            }
            ar1.add( n );

        }

        int pos = 0;
        int temp = 1;
        for ( int i = 0 ; i < nums.length ; i++ ) {
            temp *= nums[i];
        }
        for ( int m = 0 ; m < nums.length ; m++ ) {
            nums[pos++] = (temp / nums[m]);
        }
        return nums;
    }
}
