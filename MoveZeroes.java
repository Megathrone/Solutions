/**
 *
 *
 * 原题意思是把0全部移动到后面,不需要排序,所以将所有非0的数字从0开始放入,然后在后面补0
 * 注释掉的是第一次写的时候写的冒泡排序
 * @NogizakaZ
 */
public class MoveZeroes {
    public void moveZeroes ( int[] nums ) {
        int count = nums.length;
        int pos = 0;
        for ( int i = 0 ; i < nums.length ; ++i ) {
            if ( nums[i] != 0 ) {
                nums[pos++] = nums[i];
            }
        }
        while (pos < nums.length) {
            nums[pos++] = 0;
        }
//        for ( int i = 0 ; i < nums.length ; i++ ) {
//            for ( int m = i ; m < nums.length ; m++ ) {
//                if ( nums[i] > nums[m] ) {
//                    int temp = nums[i];
//                    nums[i] = nums[m];
//                    nums[m] = temp;
//                }
//            }
//        }

    }
}
