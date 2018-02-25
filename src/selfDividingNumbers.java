import java.util.ArrayList;
import java.util.List;




/**
 * selfDividingNumbers
 *
 */
public class selfDividingNumbers {
    public List<Integer> selfDividingNumber(int left,int  right){
        List<Integer> list = new ArrayList<>();
        for(int i =left;i<=right;i++){
            int j = i;
            for(;j>0;j/=10){
                if ( (j%10==0) || ( i % (j % 10) != 0) ) {
                    break;
                }
            }
            if (j==0) {
                list.add(i);
            }
        }
        return list;
    }
}