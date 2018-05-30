/**
 * LengthofLastWord
 * 这个题不难，主要是要考虑到最后一个字符串里可能有空格
 */
public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastIndex = s.lastIndexOf(' ') + 1;
        return s.length() - lastIndex;    
    }
    
}