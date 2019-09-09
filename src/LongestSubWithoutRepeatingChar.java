import java.util.*;

/**
 * LongestSubWithoutRepeatingChar
 *
 * 这道题用hashset解的，主要的思想还是维持一个window向右移动，遇到重复的就删除s的第一个， 因为已经不符合题意了
 */
public class LongestSubWithoutRepeatingChar {

    public int lengthOfLongestSubstring(String s) {
        int i = 0, max = 0;
        Set<Character> set = new HashSet<>();

        for (char word : s.toCharArray()) {
            if (!set.contains(word)) {
                set.add(word);
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }
        System.out.println(set);

        return max;
    }

    public static void main(String[] args) {
        LongestSubWithoutRepeatingChar foo = new LongestSubWithoutRepeatingChar();
        System.out.println(foo.lengthOfLongestSubstring("pwwkew"));
    }
}