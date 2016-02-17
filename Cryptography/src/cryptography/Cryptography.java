package cryptography;

/**
 *
 * @author Masatoshi Nishiguchi
 */
public class Cryptography {

    /**
     * This program decrypts a simple ciphertext that is encripted by
     * shifting the ASCII value for each character by a fixed steps, and
     * displays the all 25 patterns.
     * It also points to possibly human-readable candidates.
     * @param args the command line arguments
     */
    public static void main( String[] args ) {

        String ciphertext = "wklv phvvdjh lv qrw wrr kdug wr euhdn";
        String plaintext;

        // Check all the 25 patterns (1..25)
        for ( int shift = 1; shift < 26; shift++ ) {
            plaintext = encriptor( ciphertext, shift );

            // Print the plaintext.
            System.out.format( "Shift: %2d => %s", shift, plaintext );

            // Check the human-readability.
            if ( plaintext.contains( "is" ) ) {
                System.out.println( " <===== Check this" );
            } else {
                System.out.println();
            }
        }
    }

    /**
     * @param  ciphertext
     * @param  shift
     * @return a plain text
     */
    public static String encriptor( String ciphertext, int shift ) {

        StringBuilder sb = new StringBuilder( 100 );
        char[] chrs = ciphertext.toLowerCase().toCharArray();

        for ( char chr : chrs ) {
            if ( chr == ' ' ) {
                sb.append( ' ' );
            } else {
                sb.append( (char)( ( chr - 97 + shift ) % 26 + 97 ) );
            }
        }
        return sb.toString();
    }
}

/* OUTPUT

run:
Shift:  1 => xlmw qiwweki mw rsx xss levh xs fvieo
Shift:  2 => ymnx rjxxflj nx sty ytt mfwi yt gwjfp
Shift:  3 => znoy skyygmk oy tuz zuu ngxj zu hxkgq
Shift:  4 => aopz tlzzhnl pz uva avv ohyk av iylhr
Shift:  5 => bpqa umaaiom qa vwb bww pizl bw jzmis <===== Check this
Shift:  6 => cqrb vnbbjpn rb wxc cxx qjam cx kanjt
Shift:  7 => drsc wocckqo sc xyd dyy rkbn dy lboku
Shift:  8 => estd xpddlrp td yze ezz slco ez mcplv
Shift:  9 => ftue yqeemsq ue zaf faa tmdp fa ndqmw
Shift: 10 => guvf zrffntr vf abg gbb uneq gb oernx
Shift: 11 => hvwg asggous wg bch hcc vofr hc pfsoy
Shift: 12 => iwxh bthhpvt xh cdi idd wpgs id qgtpz
Shift: 13 => jxyi cuiiqwu yi dej jee xqht je rhuqa
Shift: 14 => kyzj dvjjrxv zj efk kff yriu kf sivrb
Shift: 15 => lzak ewkksyw ak fgl lgg zsjv lg tjwsc
Shift: 16 => mabl fxlltzx bl ghm mhh atkw mh ukxtd
Shift: 17 => nbcm gymmuay cm hin nii bulx ni vlyue
Shift: 18 => ocdn hznnvbz dn ijo ojj cvmy oj wmzvf
Shift: 19 => pdeo iaoowca eo jkp pkk dwnz pk xnawg
Shift: 20 => qefp jbppxdb fp klq qll exoa ql yobxh
Shift: 21 => rfgq kcqqyec gq lmr rmm fypb rm zpcyi
Shift: 22 => sghr ldrrzfd hr mns snn gzqc sn aqdzj
Shift: 23 => this message is not too hard to break <===== Check this
Shift: 24 => uijt nfttbhf jt opu upp ibse up csfbl
Shift: 25 => vjku oguucig ku pqv vqq jctf vq dtgcm
BUILD SUCCESSFUL (total time: 0 seconds)
 */
