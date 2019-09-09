import static java.lang.Integer.parseInt;

/**
 * Created by Iruka on 2017/5/25.
 */
public class IntToEng {

    public String numberToWords(int num) {
        String eng = "";
        String na = Integer.toString(num);
        String na1;

        if (na.length() >= 3) {
            na.substring(na.length() - 3, na.length());
            yibai(Integer.parseInt(na));
        }
        if (na.length() > 3 && na.length() <= 6) {
            na.substring(na.length() - 6);
        }
        return "";
    }

    private String yibai(int phrase) {
        int hun, ten, single;
        String eng = "";

        String num1[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine"};
        String num2[] = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixtheen",
            "seventeen", "eighteen", "nineteen"};
        String num3[] = {"", "", "twenty", "thirty", "fourty", "fifty", "sixthry", "seventy",
            "eighty", "ninety"};

        hun = phrase / 100;
        ten = (phrase % 100) / 10;
        single = (phrase % 100) % 10;

        if (hun != 0) {
            eng += num1[hun] + " hundred ";
            if (ten > 1) {
                eng += num3[ten] + " " + num1[single];
            } else if (ten == 1) {
                eng += num2[single];
            } else if (ten == 0) {
                eng += num1[single];
            }
        } else if (ten > 1) {
            eng += num3[ten] + " " + num1[single];
        } else if (ten == 1) {
            eng += num2[single];
        } else {
            eng += num1[single];
        }
        return eng;
    }

    public static void main(String[] args) {
        System.out.print(new IntToEng().numberToWords(1234));
    }
}
