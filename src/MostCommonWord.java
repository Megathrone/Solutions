/**
 * 
 * 这个题借鉴了hashtable的解法
 * 核心思路是，不在set里的就++，这样就不用一个一个判断是不是在set里面了，
 * 最后对count里面的value进行排序输出最大值
 * 
 * 使用了Collections的max方法，这个方法要求一个集合对象，和一个比较器，
 * Map.entrySet返回的是 Set<Key-Value>格式的集合，然后Map.Entry实现了Map的接口，
 * 有4个静态方法，每一种静态方法都会返回一个比较器，
 * 所以返回的部分就是使用comparingByValue的比较器对count这个集合进行排序，并且获得最大值，
 * 然后返回这个最大值的key
 */
import java.util.*;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> count = new HashMap<>();
        String[] words = p.replaceAll("\\pP", "").toLowerCase().split("\\s+");
        String res = "";
        for (String w : words)
            if (!ban.contains(w))
                count.put(w, count.getOrDefault(w, 0) + 1);
        return Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getKey();
        

    }

    public static void main(String[] args) {
        String a = "aaa, bbb ccc d dd.".replaceAll("[,.]+", "");
        System.out.println(a);
    }
}