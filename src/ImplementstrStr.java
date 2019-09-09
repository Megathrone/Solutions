/**
 * ImplementstrStr
 */
public class ImplementstrStr {

    public int strStr(String haystack, String needle) {
        int lenh = haystack.length();
        int lenn = needle.length();
        if (lenh < lenn) {
            return -1;
        } else if (lenn == 0) {
            return 0;
        }

        int window = lenh - lenn;
        for (int i = 0; i <= window; ++i) {
            if (haystack.substring(i, i + lenn).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}