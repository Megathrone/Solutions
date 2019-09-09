

public class Panlidrometwo {

    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindromic(s, left + 1, right) || isPalindromic(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isPalindromic(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "abcddcbak";
        System.out.println((new Panlidrometwo()).validPalindrome(a));
        //System.out.println(a.substring(0,2)+a.substring(3,5));

    }
}
