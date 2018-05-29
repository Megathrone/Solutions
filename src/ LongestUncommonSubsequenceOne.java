/**
 *  LongestUncommonSubsequenceOne
 */
public class  LongestUncommonSubsequenceOne {
    public int findLUSlength(String a, String b) {
        if(null ==a) return b.length();
        if(null == b) return a.length();
        if(a.equals(b)) return -1;
        String sub = a;
        for (int i = 0; i < b.length(); i++) {
            if(b.contains(sub)){
                return b.length();
            }
        }
        return sub.length();
    }
    
}