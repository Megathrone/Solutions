import java.util.HashSet;
import java.util.Set;

public class Test {

    public boolean isUgly(int num) {
        if (num > 0) {
            for (int i : new int[]{2, 3, 5}) {
                while (num % i == 0) {
                    num /= i;
                }
            }
        }
        return num == 1;

    }

    public static void main(String[] argv) {
        Test t = new Test();
        System.out.println(t.isUgly(1024));
    }
}
