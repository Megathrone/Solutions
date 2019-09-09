

public class Panlindrome {

    public boolean isPanlidrome(String s) {
        String reals = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuilder(reals).reverse().toString();
        return reals.equals(rev);
    }


    public static void main(String[] args) {
        String A = "a ba";//A aman, a plan, a cannal: Panama
        System.out.println((new Panlindrome()).isPanlidrome(A));
    }
}
