/**
 * maxSubarray
 * 
 * 动态规划
 */
public class maxSubarray {

    public int maxSubArray(int[] nums) {
        int maxNum = nums[0];
        int seqNum = 0;

        for (int i = 0; i < nums.length; i++) {
            seqNum = seqNum + nums[i];
            if (seqNum > maxNum) {
                maxNum = seqNum;
            }
            if (seqNum < 0){
                seqNum = 0;
            }
        }

        return maxNum;
    }
}