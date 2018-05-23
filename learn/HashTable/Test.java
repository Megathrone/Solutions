import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,7};
        List<Integer> ans = new ArrayList<>();
    
        Set<Integer> set = new HashSet<>();

        for (int num : a) {
            set.add(num);
        }
        System.out.println(set.iterator().hasNext());
    }
}