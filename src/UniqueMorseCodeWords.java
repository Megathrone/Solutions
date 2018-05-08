import java.util.HashSet;

/**
 * UniqueMorseCodeWords
 */
public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] table = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        HashSet<String> set = new HashSet<>();
        for (String word : words) {
            String str = "";
            for (char ch : word.toCharArray())
                str += table[ch - 'a'];
            set.add(str);
        }
        return set.size();

    }

}