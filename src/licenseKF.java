
/**
 * licenseKF
 */
public class licenseKF {

    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder(s.toUpperCase().replaceAll("-", ""));
        System.out.println(sb.toString());
        for (int i = sb.length() - k; i > 0; i -= k) {
            sb.insert(i, "-");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        licenseKF foo = new licenseKF();
        String a = foo.licenseKeyFormatting("2-5g-3-J", 2);
        System.out.print(a);
    }

}