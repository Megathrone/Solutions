import java.util.*;

public class Test {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char word : s.toCharArray()) {

            if (map.containsKey(word)) {

                map.put(word, map.get(word) + 1);

            } else {{}
                map.put(word, 1);
            }
        }
        System.out.println(map);
        for (char word : map.keySet()) {
            if (map.get(word) == 1)
                return s.indexOf(word);
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        Test foo = new Test();
        System.out.println(foo.firstUniqChar(s));

    }
}