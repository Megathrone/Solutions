/**
 *
 * 运用异或运算,相同为0
 * 很重要的是异或是有交换律的,所以其实就是把所有相同的数字移动到一起异或为0,然后异或下一个单独的数字为单独的数字
 *
 *
 * @NogizakaZ
 */
public class SingleNumber {
    public int singleNumber ( int[] nums ) {
        if ( nums == null ) {
            return 0;
        }
        int len = nums.length;
        int n = nums[0];
        for ( int i = 1 ; i < len ; i++ ) {
            n = n ^ nums[i];
        }
        return n;
    }

    public static void main ( String[] args ) {
        int[] a = {1,1, 1,2};

        System.out.print( new SingleNumber().singleNumber( a ) );
       //System.out.print(6^5);
    }
}
