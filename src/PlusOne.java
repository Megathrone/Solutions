/**
 * PlusOne
 * 这个题比较有意思，如果不连续进位的话在第一个if里就已经返回了
 * 所以只需要加1
 * 如果进了一位或者不进位到最高级，那么只需要把进位位置设为0，然后剩下的位置以此加1
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }

            digits[i] = 0;
        }

        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;


    }
}