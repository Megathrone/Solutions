/**
 * DiagonalTraverse
 * 这类二维数组的遍历题主要是考察对于坐标变化以及
 * corner case的判断
 * 多演算
 */
public class DiagonalTraverse {

    public int[] findDiagonalOrder(int[][] matrix) {
        
        if (matrix == null || matrix.length == 0) return new int[0];

        int m = matrix.length;
        int n = matrix[0].length;
        int[] res = new int[m * n];

        int row = 0;
        int col = 0;
        int axis = 0;
        //右上角是-1,1 向左下角的1,-1
        int[][] move = {{-1,1},{1,-1}};
        
        for (int i = 0; i < m*n; i++) {
            res[i] = matrix[row][col];

            col += move[axis][1];
            row += move[axis][0];
            if (row >= m) { row = m - 1; col += 2; axis = 1 - axis;}
            if (col >= n) { col = n - 1; row += 2; axis = 1 - axis;}
            if (row < 0)  { row = 0; axis = 1 - axis;}
            if (col < 0)  { col = 0; axis = 1 - axis;}
        }


        return res;
    }
}