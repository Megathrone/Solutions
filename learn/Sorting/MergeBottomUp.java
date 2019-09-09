/**
 * MergeBottomUp
 */

import java.util.Arrays;

public class MergeBottomUp {

    private static int[] aux;

    public static void sort(int[] a) {
        int N = a.length;
        aux = new int[a.length];

        for (int sz = 1; sz < N; sz++) {
            for (int lo = 0; lo < N - sz; lo += sz + sz) {
                merge(a, aux, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
            }
        }
    }

    private static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }

    public static boolean less(int v, int w) {
        return v < w;
    }

    public static void exch(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 6, 1, 2, 4, 5, 7, 1, 13, 4};
        sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(isSorted(a));

    }
}