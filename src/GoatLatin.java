import java.util.Arrays;

/**
 * GoatLatin 这个题的核心考法还是String的拼接操作，注意subString的下标
 */
public class GoatLatin {

    public String toGoatLatin(String S) {
        if (null == S || S.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String[] sub = new String[S.length()];
        sub = S.split(" ");
        String alphabet = "AaEeIiOoUu";
        int index = 1;
        System.out.println(Arrays.toString(sub));
        for (String word : sub) {
            int temp = index;
            if (alphabet.contains(word.substring(0, 1))) {
                word += "ma";
                sb.append(word);
                while (temp > 0) {
                    sb.append("a");
                    temp--;
                }
            } else {
                word = word.substring(1, word.length()) + word.substring(0, 1) + "ma";
                sb.append(word);
                while (temp > 0) {
                    sb.append("a");
                    temp--;
                }
            }
            sb.append(" ");
            index++;
        }
        return sb.toString().substring(0, sb.length() - 1);
    }

    public static void main(String[] args) {
        GoatLatin goo = new GoatLatin();

        System.out.println(
            goo.toGoatLatin("I speak Goat Latin").equals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa"));
    }

}