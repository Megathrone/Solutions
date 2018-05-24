import java.util.*;

/**
 * WordPattern
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String str) {
        Map<Character, Integer> mapP = new HashMap<>();
        Map<String, Integer> mapS = new HashMap<>();

        String[] nStr = str.split(" ");
        if (pattern.length() != nStr.length)
            return false;
        for (Integer i = 0; i < nStr.length; i++) {

            if (mapP.put(pattern.charAt(i), i) != mapS.put(nStr[i], i)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        WordPattern wp = new WordPattern();
        System.out.println(wp.wordPattern("abba", "dog cat cat dog"));
    }
}