
/**
 * Created by Iruka on 2017/5/29.
 */
public class ReverseStringII {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;
        while(i < n) {
            int j = Math.min(i + k - 1, n - 1);
            System.out.println("i"+" "+i+" "+"j"+" "+j+" "+"n"+" "+n);
            swap(arr, i, j);
            System.out.println("i"+" "+i+" "+"j"+" "+j);
            i += 2 * k;
        }
        return String.valueOf(arr);
    }
    private void swap(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
    public static void main(String[] args){
        new ReverseStringII().reverseStr("abcdef",2);
    }

}
