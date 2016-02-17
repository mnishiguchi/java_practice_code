package loops;

/**
 * Java version of the C++ lab final exam.
 * @author Masatoshi Nishiguchi
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        lab2015Final_P1();
        System.out.println("-------------------------------------");
        lab2015Final_P2();

    }


    /**
     * [lab2015Final_P1 description]
     */
    public static void lab2015Final_P1() {

      int a = 5, b = 5,
          c = 3, d = 7;

      System.out.print(a-- + " ");
      System.out.print(a   + " ");
      System.out.print(a-- + " " + a-- + " ");
      System.out.print(a-- + " " + a   + " ");
      System.out.println();

      System.out.print(++b + " ");
      System.out.print(  b + " ");
      System.out.print(++b + " " + ++b + " ");
      System.out.print(++b + " " +   b);
      System.out.println();

      a = c++ * d--;
      System.out.println(a + "  " + c + ' ' + d);
    }


    /**
     * [lab2015Final_P2 description]
     */
    public static void lab2015Final_P2() {

      int i,       // Loop control variable
          sum;     // Accumulator

      i = 1;
      while (i < 10) {

          System.out.print(i + " ");
          i += 2;

      }

      System.out.print("\nAfter loop i = " + i);
      System.out.println();
      System.out.println();

      i = 5;
      while (i > 0) {

          System.out.print(i-- + " ");

      }

      System.out.print("\nAfter loop i = " + i) ;
      System.out.println();
      System.out.println();

      i = 1;
      do {

          System.out.print(i * i + " ");
          i++;

      } while (i <= 3);

      System.out.print("\nAfter loop i = " + i);
      System.out.println();
      System.out.println();

      sum = 0;
      for (i = 0; i < 4; i++) {
          sum += i;
      }

      System.out.println("After loop i = " + i);
      System.out.print("sum = " + sum);
      System.out.println();
      System.out.println();

      for (i = 0; i++ < 4;) {

          System.out.print(i + " ");

      }

      System.out.println("\nAfter loop i = " + i);
    }
}
