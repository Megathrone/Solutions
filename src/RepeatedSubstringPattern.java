/**
 * RepeatedSubstringPattern
 */
public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = len / 2; i > 0; i--) {
            if (len % i == 0) {
                int times = len / i;
                StringBuilder sb = new StringBuilder();
                String str = s.substring(0, i);
                for (int k = 0; k < times; k++) {
                    sb.append(str);
                }
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        RepeatedSubstringPattern foo = new RepeatedSubstringPattern();
        System.out.println(foo.repeatedSubstringPattern("abcabcabcd"));
    }
}