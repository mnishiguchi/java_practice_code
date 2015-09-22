/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spikey;

/**
 * prints the following output:
 * \/
 * \\//
 * \\\///
 * ///\\\
 * //\\
 * /\ 
 * @author Masatoshi Nishiguchi
 */
public class Spikey {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        System.out.println("\\/");
//        System.out.println("\\\\//");
//        System.out.println("\\\\\\///");
//        System.out.println("///\\\\\\");
//        System.out.println("//\\\\");
//        System.out.println("/\\ ");
        
        int counter;
        
        for (int i = 1; i <= 3; i++) {

            for (counter = 0; counter < i ; counter++) {
                System.out.print("\\");
            }
            for (counter = 0; counter < i ; counter++) {
                System.out.print("/");
            }
            System.out.println();
        }
        
        for (int i = 3; i >= 1; i--) {
            
            for (counter = 0; counter < i ; counter++) {
                System.out.print("/");
            }
            for (counter = 0; counter < i ; counter++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }

}
