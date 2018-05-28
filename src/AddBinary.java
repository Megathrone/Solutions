/**
 * AddBinary
 * 
 * 二进制加法的题，这里用到的技巧就是 -'0'可以转换成int类型的变量
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        int aLen = a.length() - 1;
        int blen = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (aLen >= 0 || blen >= 0) {
            int sum = carry;
            if (aLen >= 0)
                sum += a.charAt(aLen--) - '0';
            if (blen >= 0)
                sum += b.charAt(blen--) - '0';

            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0)
            sb.append(carry);

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        AddBinary foo = new AddBinary();

        System.out.println(foo.addBinary("1111", "11"));
    }
}