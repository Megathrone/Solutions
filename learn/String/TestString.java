import java.util.Arrays;

/**
 * TestString
 */
public class TestString {

    public static void main(String[] args) {
        int[] count = new int[256];
        String al = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        String str = "ABRACADABRA";
        int len = str.length();
        for (int i = 0; i < len; i++) {
            
            count[str.toCharArray()[i]]++;
        }

        for (int i = 0; i < count.length; i++) {
            if(count[i]!=0){
                System.out.println((char)i +"出现了 "+ count[i] + "次");
            }
        }
    }
}