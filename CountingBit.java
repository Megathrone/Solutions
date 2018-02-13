/**
 *
 *
 *
 *
 *
 *@NogizakaZ
 * */
public class CountingBit {
    public int[] countBits ( int num ) {
        int[] inte = new int[num + 1];
        int st = 0;
        int cnn = 0;
        String us = "1";
        String[] bi = new String[num + 1];
        int[] con = new int[num + 1];
        for ( int i = 0 ; i <= num ; i++ ) {
            inte[i] = i;
            //System.out.println( inte[i]);
        }
        for ( int j = 0 ; j < inte.length ; j++ ) {
            bi[j] = new Integer( inte[j] ).toBinaryString( inte[j] );
            //System.out.println( new Integer( inte[j] ).toBinaryString( inte[j] ) );
            //System.out.println( bi[j]);
        }
        int k = 0;
        while (k <= bi.length - 1) {
            while ((st = bi[k].indexOf( us, st )) != -1) {
                //System.out.println( bi[k]);
                st = st + us.length();
                cnn++;

            }
            con[k] = cnn;
            cnn = 0;
            k++;

        }

        return con;


    }

    public static void main ( String[] args ) {

        int[] c = new CountingBit().countBits( 5 );
        for ( int b = 0 ; b < c.length ; b++ ) {
            System.out.println( c[b] );
        }


    }
}