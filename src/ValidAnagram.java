import java.util.HashMap;
import java.util.Map;


/**
 * ValidAnagram
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] alpha = new int[26];
        System.out.println(s.charAt(1) - 'a');
        for (int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i) - 'a']++;
            alpha[t.charAt(i) - 'a']--;
        }
        for (int var : alpha) {
            if (var != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram foo = new ValidAnagram();
        System.out.println(foo.isAnagram("anacb", "nbasa"));
    }

}