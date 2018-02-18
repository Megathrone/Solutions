/**
 * fib
 */
public class fib {
    public static void main(String[] args) {
        int a = 1;
        int b=1;
        int ans=0;
        for(int i=3 ;i<10;i++){
            ans = a + b ;
            a = b;
            b = ans;
            System.out.print(ans+" ");
        }
    }
    
}