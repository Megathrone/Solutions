/**
 * CountPrime
 */
public class CountPrime {

    public int countPrimes(int n) {
        HashSet<Integer> hset = new HashSet();
        int count = 0;
        for (int i = 2; i < n; i++) {
            hset.add(i);
        }
        int s = (int) Math.sqrt(n);

        for (int i = 2; i < s + 1; i++) {
            if (hset.contains(i)) {
                for (int j = i * 2; j < n; j += i) {
                    hset.remove(j);
                }
            }
        }

        return hset.size();

    }
}