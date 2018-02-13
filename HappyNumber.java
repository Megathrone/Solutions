import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n){
        int sum=0;
        if (n==0){
            return false;
        }
        Set<Integer> loop = new HashSet<>();
        while (loop.add(n)) {
            sum=0;
            while (n > 0) {
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            if (sum == 1) return true;
            else n = sum;
        }
        return false;
    }


    public static void main(String[] argv){
        HappyNumber  h = new HappyNumber();
        System.out.println(h.isHappy(26));



    }
}
