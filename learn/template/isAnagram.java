/**
 * isAnagram
 */
public class isAnagram {

    public boolean anagram(String a, String b) {
        int[] count = new int[26];
        for (char c : a.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : b.toCharArray()) {
            count[c - 'a']--;
        }
        for (int i : count) {
            if (i != 0)
                return false;
        }
        StringBuilder sb = new StringBuilder();
        
        return true;
    }

    public static void main(String[] args) {
        String a = "()()(";
        System.out.println(a.substring(0, 1) + a.substring(2));
    }
}

