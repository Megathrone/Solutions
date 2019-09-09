import java.util.Arrays;

/**
 * RotatedDigits 这个题主要是看pattern，最少一个2569就可以，347只要有一个就不行
 */
public class RotatedDigits {

    public int rotatedDigits(int N) {

        int count = 0;

        for (int i = 0; i <= N; i++) {
            if (helper(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean helper(int N) {
        boolean status = false;
        while (N > 0) {
            if (N % 10 == 2) {
                status = true;
            }
            if (N % 10 == 5) {
                status = true;
            }
            if (N % 10 == 6) {
                status = true;
            }
            if (N % 10 == 9) {
                status = true;
            }
            if (N % 10 == 3) {
                return false;
            }
            if (N % 10 == 4) {
                return false;
            }
            if (N % 10 == 7) {
                return false;
            }
            N = N / 10;
        }
        return status;
    }
}