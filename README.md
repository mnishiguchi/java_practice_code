# java_practice_code

## Primitive data types
- https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

### Assignment to float
```java
// incompatible types: possible lossy conversion from double to float
float length = 34.0;  // NG

float length = 34.0f; // Good
float length = 34;    // Good
float length = -34;   // Good

double length = 34.0  // Good
```

### Type casting
- Widening or Automatic type converion
- Narrowing or Explicit type conversion
- http://www.studytonight.com/java/type-casting-in-java

==

## Modulo
- Be careful when dealing with negative numbers!
```java
System.out.println(" -24 % -5 = " +  -24 % -5);  // -24 % -5 = -4
```

==

## Number format
- import java.text.DecimalFormat;
- http://docs.oracle.com/javase/7/docs/api/java/text/DecimalFormat.html

```java
// Create a DecimalFormat object to format output.    
DecimalFormat dollar = new DecimalFormat("#,##0.00");
```

```java
String pattern = "###,###.###";
DecimalFormat decimalFormat = new DecimalFormat( pattern );
double number = 123456789.123;

String formatted = decimalFormat.format( number );
System.out.println( formatted );
```

==

## Precedence
- https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
- http://introcs.cs.princeton.edu/java/11precedence/

==

## Misc ideas

```java
    private static void drawSeparator() {
        System.out.println();  // Insert a new line
        for (int i = 0; i < 48; i++) {
            System.out.print("~");
        }
        System.out.println();  // Insert a new line
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
        while (!sc.hasNextDouble()) {
            System.out.println("  Invalid input. Try again.");
            System.out.print("  >>> ");
            sc.next();  // Clear the input stream
        }

        // Read the input.
        data = sc.nextDouble();

        return data;
    }
```
