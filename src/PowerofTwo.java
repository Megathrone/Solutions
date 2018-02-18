/**
 * PowerofTwo
 */
public class PowerofTwo {
    public boolean isPowerOfTwo(int n) {
        return n >0 && ((n & (n-1))==0);
    }
    public static void main(String[] args) {
        PowerofTwo foo = new PowerofTwo();
        System.out.println(foo.isPowerOfTwo(1024));
    }
}