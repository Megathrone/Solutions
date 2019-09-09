/**
 * @author: Megathrone Selection Sort
 *
 * 选择排序是最简单的一种，思路是 1.找到整个数组中最小的数，记为min. 2.将min的数组下标和0位置的交换，然后在剩下 N-1 个元素中重复步骤1.
 * (n)+(n-1)+(n-2)+...+1 = N^2/2 对于长度为N的数组来说，选择排序需要比较 N^2/2次比较，N 次交换，可以想象成一个边长为N的正方形
 * 那么要比较对角线次，也就是总面积的一半。
 */
public class Selection {

    public static void sort(Comparable[] a) {
        // Ascend
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int k = i + 1; k < N; k++) {
                if (less(a[k], a[min])) {
                    min = k;
                }

            }
            exch(a, i, min);
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