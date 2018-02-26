import java.util.Arrays;

/**
 * MergeSortedArray
 */
public class MergeSortedArray {

    public static void merge(int[] A, int m, int[] B, int n) {
        int i=m-1, j=n-1, k=m+n-1;
        while (i>-1 && j>-1) A[k--]= (A[i]>B[j]) ? A[i--] : B[j--];
        System.out.println(Arrays.toString(A));
        while (j>-1)         A[k--]=B[j--];
        System.out.println(Arrays.toString(A));
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6,0,0,0,0,0,0};
        int[] nums2 = {3,4,5,7,90,120};
       
        merge(nums1, 6, nums2, 6);
    
    }
}