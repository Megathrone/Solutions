import java.util.Arrays;

/**
 * ReverseWordsinStringThree 注意返回的时候最后一个空字符
 */
public class ReverseWordsinStringThree {

    public String reverseWords(String s) {
        if (null == s || s.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String[] sub = new String[s.length()];
        String res = "";
        sub = s.split(" ");
        for (String word : sub) {
            StringBuilder temp = new StringBuilder(word);

            res += temp.reverse().toString() + " ";
        }
        return res.substring(0, res.length() - 1);
    }

    public static void main(String[] args) {
        ReverseWordsinStringThree foo = new ReverseWordsinStringThree();
        System.out.println(foo.reverseWords("Let's go leetcode"));
    }

}