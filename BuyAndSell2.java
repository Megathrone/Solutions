/**
 *
 * 贪心算法 局部最优解
 * @NogizakaZ
 */
public class BuyAndSell2 {
    public int maxProfit ( int[] prices ) {
        int earn = 0;
        for ( int i = 1 ; i < prices.length ; i++ ) {
            earn += (prices[i] > prices[i - 1] ? prices[i] - prices[i - 1] : 0);
        }
        return earn;
    }
}
