/**
 * palindrome
 * without extra space
 */
public class palindrome {
    public boolean isPalindrome(int x) {
        // StringBuilder sb = new StringBuilder().append(x);
        // String old = sb.toString();
  
        // if (sb.reverse().toString().equals(old)) {
        //     return true;
        // }
        // return false;
        int input = x;
        int res=0;
        while (x>0) {
            res = res * 10 + x %10;
            x/=10;
        }
        return res==input;
    }

    public static void main(String[] args) {
        palindrome foo = new palindrome();
        System.out.println(foo.isPalindrome(123321));
    }

    
}