



public class ToHex {
    char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
    public String toHex(int num){
        if (num==0) return "0";
        String str = "";
        while (num!=0){
            str = map[(num & 15)] +str;
            num = (num >>> 4);
        }
        return str;
    }

    public String toBi(int num){
        if (num==0) return "0";
        String str = "";
        while (num!=0){
            str = map[(num & 1)] +str;
            num = (num >>> 1);
        }
        return str;
    }
    public String toEi(int num){
        if (num==0) return "0";
        String str = "";
        while (num!=0){
            str = map[(num & 7)] +str;
            num = (num >>> 3);
        }
        return str;
    }

    public static void main(String[] argv){
        System.out.println((new ToHex()).toEi(32));
        //System.out.println((37 & 15));
    }
}
