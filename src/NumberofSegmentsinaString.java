/**
 * NumberofSegmentsinaString 用了一个正则表达式，不是很优雅
 */
public class NumberofSegmentsinaString {

    public int countSegments(String s) {
        String sub = s.trim();
        if (sub.length() == 0) {
            return 0;
        }
        return sub.split("\\s+").length;
    }

    public static void main(String[] args) {
        NumberofSegmentsinaString foo = new NumberofSegmentsinaString();
        System.out.println(foo.countSegments("my world"));
    }
}