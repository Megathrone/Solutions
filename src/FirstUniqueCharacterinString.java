/**
 * FirstUniqueCharacterinString
 */
public class FirstUniqueCharacterinString {

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char word : s.toCharArray()) {

            if (map.containsKey(word)) {

                map.put(word, map.get(word) + 1);

            } else {
                map.put(word, 1);
            }
        }
        for (char word : map.keySet()) {
            if (map.get(word) == 1)
                return s.indexOf(word);
        }
        return -1;
    }
}