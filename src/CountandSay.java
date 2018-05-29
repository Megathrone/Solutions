import java.util.*;

/**
 * CountandSay
 * 从1层开始构造，用count变量记录有多少个相同的字符出现
 */
public class CountandSay {

    public String countAndSay(int n) {
        String res = "1";
        for (int i = 1; i < n; i++) {
            res = helper(res);
        }

        return res;
    }

    private static String helper(String s){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char c = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                count++;
            }else{
                sb.append(count).append(c);
                count = 1;
                c = s.charAt(i);
            }
        }
        sb.append(count).append(c);

        return sb.toString();
    }
}