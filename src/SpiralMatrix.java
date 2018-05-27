import java.util.*;

/**
 * SpiralMatrix
 */
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix.length==0) return res;
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int num : matrix[i]) {
                    res.add(num);
                }
            } else {
                for (int k = matrix[i].length - 1; k >= 0; k--) {
                    res.add(matrix[i][k]);
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, 
                           { 5, 6, 7, 8 }, 
                           { 9, 10, 11, 12 } 
                    };
        SpiralMatrix foo = new SpiralMatrix();
        System.out.println(foo.spiralOrder(matrix));
    }
}