import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GroupAnagrams
 * 
 * 这是一个经典的HashMap问题，首先要判断一组字符串是不是成组的，可以把每个String对象进行排序
 * 排序之后大家都是相同的，然后就可以用hashmap一套带走，hashmap的核心精髓就是要保持前后一致
 * 排序的时候要注意Arrays.sort这个方法的使用模板
 * 
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] ca = word.toCharArray();
            Arrays.sort(ca);
            String temp = String.valueOf(ca);

            if (!map.containsKey(temp))
                map.put(temp, new ArrayList<String>());
            map.get(temp).add(word);
        }

        return new ArrayList<List<String>>(map.values());
    }

    public static void main(String[] args) {
        String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };
        GroupAnagrams foo = new GroupAnagrams();
        System.out.println(foo.groupAnagrams(str));

    }
}