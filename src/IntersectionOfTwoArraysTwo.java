import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by Iruka on 2017/5/27.
 */
public class IntersectionOfTwoArraysTwo {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> intersec = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int i=0,j=0;i<nums1.length&&j<nums2.length;){
                if (nums1[i] < nums2[j]) {
                    i++;
                } else if (nums1[i]==nums2[j]){
                    intersec.add(nums1[i]);
                    i++;
                    j++;
                }else{
                    j++;
                }
        }
        int[] res = new int[intersec.size()];

        for (int k=0;k<intersec.size();k++){
            res[k] = intersec.get(k);
        }
        return res;

    }

    public static void main(String[] args){
        int[] n1 = new int[]{1,2,2,3,4,5,6};
        int[] n2 = new int[]{2,2,3};
        System.out.println(Arrays.toString(new IntersectionOfTwoArraysTwo().intersect(n1, n2)));
        System.out.println(n1);
    }
}
