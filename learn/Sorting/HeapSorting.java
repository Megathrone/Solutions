/**
 * HeapSorting
 *
 * 堆排序 堆排序的核心思路是首先根据输入的数组序列构建一个 堆有序的二叉树，也就是说真个构建好的树 符合堆的特点，但是不是有序的，只是根节点大于等于子节点
 *
 * 然后对这个堆进行堆排序，下沉排序获得最终的排序好的结果
 */


import java.util.Arrays;

public class HeapSorting {

    private HeapSorting() {
    }

    public static void sort(int[] pq) {
        int n = pq.length;
        for (int k = n / 2; k >= 1; k--) {
            sink(pq, k, n);
        }
        while (n > 1) {
            exch(pq, 1, n--);
            sink(pq, 1, n);
        }
    }

    private static void sink(int[] pq, int k, int n) {
        while (2 * k <= n) {
            int j = 2 * k;
            if (j < n && less(pq, j, j + 1)) {
                j++;
            }
            if (!less(pq, k, j)) {
                break;
            }
            exch(pq, k, j);
            k = j;
        }
    }

    private static boolean less(int[] pq, int i, int j) {
        return pq[i - 1] < pq[j - 1];
    }

    private static void exch(int[] pq, int i, int j) {
        int t = pq[i - 1];
        pq[i - 1] = pq[j - 1];
        pq[j - 1] = t;
    }

    private static void show(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 23, 45, 63, 437, 345, 457, 3456, 345, 342, 3456, 3456, 456, 234, 457,
            679, 780, 5, 1, 2, 34, 5, 5, 1, 1};
        sort(a);
        show(a);
    }
}