import java.util.HashMap;
import java.util.Map;

public class RepStrMatch {

    public int repeatedStringMatch(String A, String B) {
        StringBuilder sb = new StringBuilder();
        sb.append(A);
        int res = 1;

        while (sb.indexOf(B) < 0) {
            if (sb.length() - A.length() > B.length()) {
                return -1;
            }
            sb.append(A);
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        String A = "abcd";
        String B = "bcdabcda";
        System.out.println((new RepStrMatch()).repeatedStringMatch(A, B));
        System.out.println(A.indexOf(B));

    }
}
