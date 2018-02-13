/**
 *
 *
 *
 *
 * 要赢的话也就是说最后剩4个,然后轮到对方走,不论对方怎么走都可以应 1 1 2 4 7 有点像斐波那契数列。所以前面一定要拿完4的倍数,所以第一次拿
 * 4取余
 *
 * @NogizakaZ
 */
public class CanWinNim {
    public boolean canWinNim ( int n ) {
        return n%4!=0;
    }

    public static void main ( String[] args ) {
        System.out.print(new CanWinNim().canWinNim(5));

    }
}
