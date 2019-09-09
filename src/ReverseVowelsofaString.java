import java.util.Arrays;
import java.util.*;

/**
 * ReverseVowelsofaString 先把元音字母提取出来，然后把原来字符串挖出一个空 之后翻转元音数组，然后在依次填入 脏活累活
 */
public class ReverseVowelsofaString {

    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();
        String vowels = "aeiouAEIOU";

        if (null == s || s.length() == 0) {
            return "";
        }

        int index = 0;
        List<Character> list = new ArrayList<>();
        String[] sub = s.split("");
        for (char word : s.toCharArray()) {
            if (vowels.contains(Character.toString(word))) {
                sb.append(word);
                sub[index] = " ";
            }
            index++;
        }
        char[] re = sb.reverse().toString().toCharArray();
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (sub[i] == " ") {
                sub[i] = Character.toString(re[k]);
                k++;
            }
        }

        StringBuilder res = new StringBuilder();
        for (String word : sub) {
            res.append(word);
        }
        return res.toString();

    }

    public static void main(String[] args) {
        ReverseVowelsofaString foo = new ReverseVowelsofaString();
        System.out.println(foo.reverseVowels("leetcode"));
    }

}