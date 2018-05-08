import java.util.HashMap;
import java.util.Map;

public class JewelsandStones {

    public static int numJewelsInStones(String J, String S) {
        Map<Character, Integer> mapJ = new HashMap<>();
        int ans = 0;

        for (char ch : J.toCharArray()) {
            mapJ.put(ch, mapJ.containsKey(ch) ? mapJ.get(ch) + 1 : 1);
        }
        for (char ch : S.toCharArray()) {
            if (mapJ.containsKey(ch))
                ans++;
        }
        return ans;
    }

}