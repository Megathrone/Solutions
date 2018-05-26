import java.util.*;

/**
 * TopKFrequentElements
 */
public class TopKFrequentElements {

    public List<Integer> topKFrequent(int[] nums, int k) {
        // Map<Integer, Integer> mapKey = new HashMap<>();
        // Map<Integer, Integer> mapValue = new HashMap<>();

        // for (int num : nums) {
        // mapKey.put(num, mapKey.getOrDefault(num, 0)+1);
        // }

        // for (Map.Entry<Integer,Integer> entry : mapKey.entrySet()) {
        // mapValue.put(entry.getValue(), entry.getKey());
        // }

        // List<Integer> sub = new ArrayList<>();
        // List<Integer> res = new ArrayList<>();
        // for (int num : mapValue.keySet()){
        // sub.add(num);
        // }
        // Collections.reverse(sub);
        // for (int i = 0; i < k; i++) {
        // res.add(mapValue.get(sub.get(i)));
        // }
        // return res;

        Map<Integer, Integer> frequentMap = new HashMap<>();
        List<Integer>[] reverse = new ArrayList[nums.length + 1];
        
        for (int num : nums) {
            frequentMap.put(num, frequentMap.getOrDefault(num, 0) + 1);
        }

        for (int key : frequentMap.keySet()) {
            int frequency = frequentMap.get(key);
            if (reverse[frequency] == null) {
                reverse[frequency] = new ArrayList<>();
            }
            reverse[frequency].add(key);
        }

        List<Integer> res = new ArrayList<>();

        for (int pos = reverse.length - 1; pos >= 0 && res.size() < k; pos--) {
            if (reverse[pos] != null) {
                res.addAll(reverse[pos]);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        TopKFrequentElements foo = new TopKFrequentElements();
        int[] a = { 1, 2 };

        System.out.println(foo.topKFrequent(a, 2));
    }
}