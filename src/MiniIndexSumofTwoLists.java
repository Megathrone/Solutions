import java.util.*;

/**
 * MiniIndexSumofTwoLists
 */
public class MiniIndexSumofTwoLists {

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> interSect = new HashMap<>();
        int min = Integer.MAX_VALUE;
        List<String> res = new ArrayList<>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        for (int i = 0; i < list2.length; i++) {
            if(map.containsKey(list2[i])){
                int indexSum = map.get(list2[i]) + i;
                interSect.put(list2[i], indexSum);
                min = Math.min(indexSum, min);
            }
        }
        
        for (Map.Entry<String,Integer> entry : interSect.entrySet()) {
            if(entry.getValue() == min){
                res.add(entry.getKey());
            }
        }

        return res.toArray(new String[res.size()]);
        
    
        

    }
}