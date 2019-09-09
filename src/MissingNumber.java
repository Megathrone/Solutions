import java.util.Arrays;

/**
 * Created by Iruka on 2017/5/29.
 */

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int sum = nums.length;
        for (int i = 0; i < nums.length; i++) {
            sum += i - nums[i];
        }
        return sum;

    }

    public static void main(String[] args) {
        int[] num = new int[]{0, 1, 2};
        System.out.println(new MissingNumber().missingNumber(num));
    }
}
