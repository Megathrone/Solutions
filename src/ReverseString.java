/**
 *
 * StringBuilder竟然比直接写要好用,不是很懂leetcode :)
 * @Nogizakaz
 */
public class ReverseString {
    public String reverseString ( String s ) {
        if ( s.isEmpty() ) {
            return "null";
        }

        return new StringBuilder( s ).reverse().toString();


    }

    public static void main ( String[] args ) {
        String b = "abc";
        String a = new String( b );
        System.out.print( new ReverseString().reverseString( a ) );

    }

}
