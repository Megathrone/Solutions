/**
 * Climbings
 */
public class Climbings {

    public int climbStairs(int n) {

        int ans = 0;
        int firstOne = 1;
        int firstTwo = 2;

        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        for (int i = 2; i < n; i++) {
            ans = firstOne + firstTwo;
            firstOne = firstTwo;
            firstTwo = ans;
        }
        return ans;


    }

    public static void main(String[] args) {
        Climbings foo = new Climbings();
        System.out.print(foo.climbStairs(7));

    }
}