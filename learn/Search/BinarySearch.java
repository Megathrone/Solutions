import java.util.*;

public class BinarySearch {

    public static int BS(int key, int[] array) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key < array[mid])
                high = mid - 1;
            else if (key > array[mid])
                low = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 23, 45, 23, 56, 112, 45, 2, 34, 14, 23, 67, 565, 12344, 123, 235 };
        int key = 112;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(BS(key, array));
    }
}