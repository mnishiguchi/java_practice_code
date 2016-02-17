package cryptography;

import java.util.Scanner;

/**
 *
 * @author Masatoshi Nishiguchi
 */
public class Cryptography {

    /**
     * This program decrypts a simple ciphertext that is encrypted by
     * shifting the ASCII value for each character by a fixed step, and
     * displays the all 25 patterns.
     * It also points to possibly human-readable candidates.
     * @param args the command line arguments
     */
    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );

        // Propmpt user for the original text.
        System.out.print("Enter your message: ");
        String plaintext = sc.nextLine();

        // Propmpt user for the encryption key.
        System.out.print("Enter your key: ");
        int key = sc.nextInt();
        System.out.println();

        // Generate a ciphertext.
        String ciphertext = encryptor( plaintext, key );
        System.out.format( "ciphertext: %s%n", ciphertext );
        System.out.println("------------------------------------------------------");

        // Check all the 25 patterns and output them.
        for ( int k = 1; k < 26; k++ ) {

            // Decrypt the text with this key.
            plaintext = decryptor( ciphertext, k );

            // Print the plaintext.
            System.out.format( "Key: %2d (%3d) => %s", k, -(26-k), plaintext );

            // Check the human-readability.
            // https://en.m.wikipedia.org/wiki/Most_common_words_in_English
            String regex = ".*\\s(the|be|is|am|are|to|of|and|in|that|it|for|not|on|with|you|do|at|this)\\s.*";
            if ( plaintext.matches( regex ) ) {
                System.out.println( " <=== Check this" );
            } else {
                System.out.println();
            }
        }
    }


    /**
     * @param  plaintext
     * @param  key
     * @return ciphertext
     */
    public static String encryptor( String plaintext, int key ) {

        // Convert negative key into its positive equivalent.
        key = ( key < 0 ) ? ( key + 26 ) : key;

        // Instantiate a builder to build the ciphertext.
        StringBuilder sb = new StringBuilder( 100 );

        // Convert the plaintext into a char array (all lowercase).
        char[] chrs = plaintext.toLowerCase().toCharArray();

        // Convert each char into ciphertext.
        for ( char chr : chrs ) {
            if ( Character.isLetter( chr ) ) {
                sb.append( (char)( ( chr - 97 + key ) % 26 + 97 ) );
            } else {
                sb.append( chr );
            }
        }
        return sb.toString();
    }


    /**
     * @param  ciphertext
     * @param  key
     * @return plaintext
     */
    public static String decryptor( String ciphertext, int key ) {

        key = 26 - key;
        return encryptor( ciphertext, key );
    }
}

/* OUTPUT

run:
Enter your message: This message is not too hard to break!
Enter your key: -13

ciphertext: guvf zrffntr vf abg gbb uneq gb oernx!
------------------------------------------------------
Key:  1 (-25) => ftue yqeemsq ue zaf faa tmdp fa ndqmw!
Key:  2 (-24) => estd xpddlrp td yze ezz slco ez mcplv!
Key:  3 (-23) => drsc wocckqo sc xyd dyy rkbn dy lboku!
Key:  4 (-22) => cqrb vnbbjpn rb wxc cxx qjam cx kanjt!
Key:  5 (-21) => bpqa umaaiom qa vwb bww pizl bw jzmis!
Key:  6 (-20) => aopz tlzzhnl pz uva avv ohyk av iylhr!
Key:  7 (-19) => znoy skyygmk oy tuz zuu ngxj zu hxkgq!
Key:  8 (-18) => ymnx rjxxflj nx sty ytt mfwi yt gwjfp!
Key:  9 (-17) => xlmw qiwweki mw rsx xss levh xs fvieo!
Key: 10 (-16) => wklv phvvdjh lv qrw wrr kdug wr euhdn!
Key: 11 (-15) => vjku oguucig ku pqv vqq jctf vq dtgcm!
Key: 12 (-14) => uijt nfttbhf jt opu upp ibse up csfbl!
Key: 13 (-13) => this message is not too hard to break! <=== Check this
Key: 14 (-12) => sghr ldrrzfd hr mns snn gzqc sn aqdzj!
Key: 15 (-11) => rfgq kcqqyec gq lmr rmm fypb rm zpcyi!
Key: 16 (-10) => qefp jbppxdb fp klq qll exoa ql yobxh!
Key: 17 ( -9) => pdeo iaoowca eo jkp pkk dwnz pk xnawg!
Key: 18 ( -8) => ocdn hznnvbz dn ijo ojj cvmy oj wmzvf!
Key: 19 ( -7) => nbcm gymmuay cm hin nii bulx ni vlyue!
Key: 20 ( -6) => mabl fxlltzx bl ghm mhh atkw mh ukxtd!
Key: 21 ( -5) => lzak ewkksyw ak fgl lgg zsjv lg tjwsc!
Key: 22 ( -4) => kyzj dvjjrxv zj efk kff yriu kf sivrb!
Key: 23 ( -3) => jxyi cuiiqwu yi dej jee xqht je rhuqa!
Key: 24 ( -2) => iwxh bthhpvt xh cdi idd wpgs id qgtpz!
Key: 25 ( -1) => hvwg asggous wg bch hcc vofr hc pfsoy!
BUILD SUCCESSFUL (total time: 8 seconds)
 */
