import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iruka on 2017/5/27.
 */
public class BinaryWatch {

    public List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<>();
        for (int h = 0; h < 12; h++) {
            for (int min = 0; min < 60; min++) {
                if ((Integer.bitCount(h) + Integer.bitCount(min)) == num) {
                    times.add(String.format("%d:%02d", h, min));
                }
            }
        }
        return times;
    }

    public static void main(String[] args) {
        System.out.println(new BinaryWatch().readBinaryWatch(1));
        //System.out.println(Integer.bitCount(2));
    }
}
