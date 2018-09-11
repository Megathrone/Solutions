import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;

/**
 * TestString
 */
public class TestString {

    public static String dateToString(int d, int m, int y) {
        String date = String.format("%d, %m, %y", d, java.time.Month.of(m), y);
        return date;
    }

    public static boolean stringE(String s) {
        int eCount = 0;
        for (int i = 0; i < s.length(); i = i + 1) {
            System.out.println(s.charAt(i));
            if (String.valueOf(s.charAt(i)).equals("e")) {
                eCount++;
            }
        }
        System.out.println(eCount);
        if (eCount > 1) {
            return true;
        }
        return false;
    }
    public static int foo(int x,int y){
        if(x<=0||y<=0) return 1;
        return 3*foo(x-1,y/2);
    }
    public static void main(String[] args) {
       System.out.println(foo(666,5));
    }

}