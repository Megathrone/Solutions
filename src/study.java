import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Iruka on 2017/7/2.
 */
public class study {

    public boolean haha(String s) {
        if (s.equals("a")) {
            return false;
        }
        if (s.equals("b")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        study s = new study();

        System.out.println(s.haha("b") || s.haha("c"));
    }

}
