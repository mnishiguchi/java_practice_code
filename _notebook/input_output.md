# Input Output

## Basic input using Scanner

- `import java.util.Scanner;`
- [doc](http://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html)

```java
import java.util.Scanner; // Enables user input

public class Salary {
   public static void main(String [] args) {
      int hourlyWage   = 0;
      int annualSalary = 0;

      // Setup to scan chars from System.in
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter hourly wage: ");

      // Read next integer from scanner
      hourlyWage = sc.nextInt();

      annualSalary = hourlyWage * 40 * 50;
      System.out.println("Salary is " + annualSalary);

      return;
   }
}
```

```java
    /**
     * Prompts the user for a double data.
     * @param A Scanner object.
     * @param A message for the prompt.
     * @return data of double type.
     */
    public static double propmtUserDouble(Scanner sc, String msg) {

        double data;

        // Print the prompt message.
        System.out.print(msg);

        // Validate the input.
        while ( ! sc.hasNextDouble() ) {
            System.out.println("Invalid input. Try again.");
            System.out.print(">>> ");
            sc.next();  // Clear the input stream
        }

        // Read the input.
        data = sc.nextDouble();

        return data;
    }
```

```java
    /**
     * Prompt the user to enter integers between 1 and 100, counts the occurrences
     * of each number and store the occurrences to the specified int array.
     * @param sc           An instance of Scanner.
     * @param occurrences  An int array with 100 elements, to which we write occurrence data.
     */
    private static void inputIntegers(Scanner sc, int[] occurrences) {

        int temp;
        System.out.println("Enter the integers between 1 and 100 (0: quit): ");
        System.out.print(">>> ");

        while ( true ) {

            // Reject non-integer input.
            while ( ! sc.hasNextInt() ) {
                System.out.println("Invalid input. Try again.");
                System.out.print(">>> ");
                sc.next();  // Clear the input stream
            }

            // Read the user's input.
            temp = sc.nextInt();

            // Exit the loop if the input is 0.
            if ( temp == 0 ) { break; }

            // Validate the input: Must be between 1 and 100.
            if ( temp < 0 || temp > 100 ) {
                System.out.println("Invalid input: Must be between 1 and 100 (0: quit)");

            } else {    // Success.
                // Increment the occurrence at the appropriate index.
                occurrences[ temp ] += 1;
            }

            // Prepare the prompt for next number.
            temp = -1;  // Reset the temp variable.
            System.out.print(">>> ");
        }
    }
```


### sc.next() vs sc.nextLine()

**The next() method**
- reads a string that ends with a whitespace character

**the nextLine() method**
- reads an entire line of text
- reads a string that ends with the Enter key pressed

### Reading a single character

- The Scanner does not directly support reading a single character.
1. read a string from the user input using `usrInput = sc.next();`
2. get the first character using `usrInput.charAt(0);`

```java
Scanner sc = new Scanner(System.in);
usrInput = sc.next();
userChar = usrInput.charAt(0); // Get the first char in the String
```

```java
Scanner sc = new Scanner(System.in);
//...
while (true) {
    String line = sc.nextLine();         // Read the user's input
    if (line.length() > 0) {             // Reject empty strings
        menuSelection = line.charAt(0);  // Get the first char in the String
        break;
    }
}
```

### Input validation

```java
// Ensure that the input is an integer
while (!sc.hasNextInt()) {
    System.out.println("   Invalid input");

    sc.next();  // Clear the input stream
}
```

==

## InputStream and System.in
- [Oracle's Java tutorials on I/O Streams](http://docs.oracle.com/javase/tutorial/essential/io/streams.html)
- [Oracle's InputStream class specification](http://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)

### System.in
- A predefined input stream object reference that is associated with a system's standard input, which is usually a keyboard
- The System class is a predefined class and does **not require an import statement**
- Reads bytes from a memory region initialized by the operating system
- Is an **input byte stream**
- `System.in.read()` reads the **first 8-bit ASCII value** available from the operating system's buffer
- Each 8-bit value read from the input stream is returned as an int (instead of byte)
- If data is no longer available, that is indicated by a return value of -1.

### throws IOException
- When using an InputStream, a programmer must append the clause `throws IOException` to the definition of main()
- A throws clause tells the JVM that the corresponding method may exit unexpectedly due to an exception, which is an event that disrupts a program's execution
- a program typically uses the `Scanner` class as a wrapper that augments `System.in` by automatically scanning a sequence of bytes and converting those bytes to the desired data type

==

## OutputStream and System.out
- [Class OutputStream](http://docs.oracle.com/javase/7/docs/api/java/io/OutputStream.html)
- [Class PrintStream](http://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html)
- [Class System](http://docs.oracle.com/javase/7/docs/api/java/lang/System.html)

### OutputStream
- provides several overloaded methods for writing a sequence of bytes to a destination. That sequence is normally placed into a buffer, and the system then outputs the buffer at various times.

### System.out
- A predefined output stream object reference that is associated with a system's standard output, usually a computer screen
- A reference derived from OutputStream called a PrintStream
- The System class is predefined and does **not require an import statement**.

### The PrintStream class
- extends the base functionality of the OutputStream class
- provides the print() and println() methods for converting different types of data into a sequence of characters

### The print() and println() methods
- **overloaded to support the various standard data types**, such as int, boolean, float, etc., each method converting that data type to a sequence of characters
- When a programmer invokes either printing method with an argument of a reference type, the method **prints a string representation of the object**

### The string representation of the object
- class_name@hex_value_of_object_hash_code
- A hash code typically represents the object's address in memory


