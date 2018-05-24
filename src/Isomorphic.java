import java.util.*;



/**
 * Isomorphic
 */
public class Isomorphic {
    public static boolean isIsomorphic(String s1, String s2) {
       
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();
        
        for(Integer i = 0; i < s1.length(); i++) {
            
            System.out.println(s1.charAt(i));
            if(m1.put(s1.charAt(i), i) != m2.put(s2.charAt(i), i)) {
                return false;
            }
        }
        
        return true;
    }
    

    public static void main(String[] args) {
        System.out.println(isIsomorphic("title", "pappr"));
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();
        m1.put('a',1);
        System.out.println(m1.put('a', 2));

    }
}