# Input Output

## Basic input

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
