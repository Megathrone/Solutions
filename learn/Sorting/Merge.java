import java.util.Arrays;

/**
 * @author:Megathrone
 * Merge
 * 
 * 
 * 归并排序的本质是分治法 （再一次想想斐波那契）把问题分解成两个部分然后分别解决这两个部分
 * 之后把这两个部分合起来
 * 
 * 其实每一次merge都是base case，然后累加
 * 
 * 2分法的复杂度可能都是NlogN,因为都是以2为底
 * 
 * 改进方法是设置一个区间然后这个区间内使用插入排序
 */
public class Merge {

    
    private static int[] aux;
    public static void sort(int[] a){
        aux = new int[a.length];
        sort(a, aux, 0, a.length-1);
    }


    private static void sort(int[] a,int[] aux,int lo, int hi){
        if (hi <=lo) {
            return;
        }

        int mid=lo+(hi-lo)/2;
        sort(a,aux,lo,mid);
        sort(a,aux,mid+1,hi);
        merge(a,aux,lo,mid,hi);
    }

    private static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            if (i > mid)
                a[k] = aux[j++];
            else if (j > hi)
                a[k] = aux[i++];
            else if (less(aux[j], aux[i]))
                a[k] = aux[j++];
            else
                a[k] = aux[i++];
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
            if (less(a[i], a[i - 1]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = { 4, 5, 6, 1, 2, 4, 5, 7, 1, 13, 4 };
        sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(isSorted(a));

    }
}