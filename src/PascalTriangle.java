import java.util.*;
/**
 * PascalTriangle
 * 杨辉三角，核心思想是卡着位置来循环
 * 以及每一行的数组长度与二维数组length的关系
 */
public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0)
            return res;

        for (int i = 0; i < numRows; i++) {
            List<Integer> subList = new ArrayList<>();
            for (int j = 0; j < i+1; j++) {
                if(j==0 || j==i){
                    subList.add(1);
                }else{
                    subList.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
                }
            }
            res.add(subList);
        }
        return res;
    }
}