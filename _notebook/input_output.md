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

==

## Reading a single character

- The Scanner does not directly support reading a single character.
1. read a string from the user input using `usrInput = sc.next();`
2. get the first character using `usrInput.charAt(0);`

```java
Scanner sc = new Scanner(System.in);
usrInput = sc.next();
userChar = usrInput.charAt(0); // Get the first char in the String
```

==

## Input validation

```java
// Ensure that the input is an integer
while (!sc.hasNextInt()) {
    System.out.println("   Invalid input");

    sc.next();  // Clear the input stream
}
```

==

## OutputStream and System.out
- [Class OutputStream](http://docs.oracle.com/javase/7/docs/api/java/io/OutputStream.html)
- [Class PrintStream](http://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html)
- [Class System](http://docs.oracle.com/javase/7/docs/api/java/lang/System.html)

### OutputStream
- provides several overloaded methods for writing a sequence of bytes to a destination. That sequence is normally placed into a buffer, and the system then outputs the buffer at various times.

### System.out
-  a predefined output stream object reference that is associated with a system's standard output, usually a computer screen
-  a reference derived from OutputStream called a PrintStream
- The System class is predefined and does **not require an import statement**.

### The PrintStream class
- extends the base functionality of the OutputStream class
- provides the print() and println() methods for converting different types of data into a sequence of characters

### The print() and println() methods
- **overloaded to support the various standard data types**, such as int, boolean, float, etc., each method converting that data type to a sequence of characters
- When a programmer invokes either printing method with an argument of a reference type, the method **prints a string representation of the object**.

### The string representation of the object
- class_name@hex_value_of_object_hash_code
- A hash code typically represents the object's address in memory

==

## InputStream and System.in

###

