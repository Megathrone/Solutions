import java.util.HashSet;
import java.util.Objects;

/**
 *
 *
 *
 * 首先从数组首部开始放入hashset,如果后面遇到相同的就删除,这样最后剩下的就是只有一个的,然后用object转化为数组对象输出。
 * @NogizakaZ
 */
public class SingleNumber3 {
    public int[] singleNumber ( int[] nums ) {
        HashSet<Integer> ar1 = new HashSet<Integer>();
        int[] out = new int[2];
        for ( int n:nums ) {
            if ( ar1.contains( n ) ) {
                ar1.remove( n );
            } else {
                ar1.add( n );
            }
        }
        Object[] ar3 = ar1.toArray();
        out[0] = (int)ar3[0];
        out[1] = (int)ar3[1];

        return out;

    }


}
