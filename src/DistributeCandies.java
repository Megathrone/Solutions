import java.util.*;

/**
 * DistributeCandies
 */
public class DistributeCandies {

    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int candy : candies) {
            set.add(candy);
        }

        return set.size() > candies.length / 2 ? candies.length / 2 : set.size();
    }

}