/**
 * Created by Iruka on 2017/6/3.
 */
public class solution {
    public int aplusb(int a, int b)
    {
        //1、a，b进行异或运算，计算出不变的位
        //2、计算出进位(求与)
        //3、相加即可
        if (b == 0)
            return a;
        int temp1 = a^b;
        int temp2 = (a&b) << 1;//可能产生进位
        System.out.println("tmp1: " +temp1);
        System.out.println("temp2: "+temp2);

        return aplusb(temp1, temp2);
    }
    public static void main(String[] args){
        System.out.println(new solution().aplusb(1889789798,289798897));
    }
}
