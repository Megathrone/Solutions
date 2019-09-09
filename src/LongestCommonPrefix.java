/**
 * LongestCommonPrefix 首先这道题的破题点在于， 假设第一个string是prefix，那么从下标1开始， 如果1不包含0位置的pre说明pre取长了，变短一个
 * 以此类推就得到了pre
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (null == strs || strs.length == 0) {
            return "";
        }

        String pre = strs[0];
        int i = 1;
        while (i < strs.length) {
            while (strs[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
            }
            i++;
        }
        return pre;
    }


    public static void main(String[] args) {
        LongestCommonPrefix foo = new LongestCommonPrefix();

        String[] strs = {
            "flowers",
            "flow",
            "fla"
        };
        System.out.println(foo.longestCommonPrefix(strs));
    }
}