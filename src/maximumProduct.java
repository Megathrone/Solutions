import java.util.Arrays;

/**
 * maximumProduct
 */
public class maximumProduct {

    public static int maximumProduct(int[] nums) {

        Arrays.sort(nums);

        int left = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int right = nums[0] * nums[1] * nums[nums.length - 1];

        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int[] a = new int[]{-1, -2, -3, 0};
        System.out.println(maximumProduct(a));
    }

}