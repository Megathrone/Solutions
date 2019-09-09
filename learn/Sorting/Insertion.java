/**
 * @author:Megathrone Insertion
 *
 * 思路是每次比较一个位置与前一个位置的大小，然后进行交换 最好情况是比较N-1次也就是说不需要交换，因为是排好序的就只是过一遍数组而已。
 * 最差情况是倒序，那么就要N^2/2次，所以平均是N^2/4次比较和交换 在倒置的元素数量很少时，插入排序是最快的一种
 *
 *
 * 对于随机排序的无重复主键的数组来说，选择排序和插入排序的运行时间是 O(n^2) 两者之间的比应该是一个较小的常数。
 */
public class Insertion {

    public static void sort(Comparable[] a) {
        // Ascend
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int k = i; k > 0 && less(a[k], a[k - 1]); k--) {
                exch(a, k, k - 1);
            }
        }
    }

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Comparable[] a = {4, 5, 6, 1, 2, 4, 5, 7, 1, 13, 4};
        sort(a);
        System.out.println(isSorted(a));
    }
}