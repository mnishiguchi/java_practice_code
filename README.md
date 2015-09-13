# java_practice_code

==

## String comparisons

### str1.equals(str2)

- to compare two strings, use `str1.equals(str2)` instead of `==`
- returns true if the two strings are equal

### str1.compareTo(str2)

|Relation    |Returns |Expression to detect|
|---|---|---|
|str1 less-than str2    |Negative number |str1.compareTo(str2) < 0  |
|str1 equal-to str2     |0               |str1.compareTo(str2) == 0 |
|str1 greater-than str2 |Positive number |str1.compareTo(str2) > 0  |


## String access operations

str.length() 
- Number of characters    

str.isEmpty()
- true if length is 0 

str.indexOf(item)
- Index of first item occurrence, else -1. 
- Item may be char, String variable, or string literal. 

str.indexOf(item, indx)
- starts searching at index indx.

str.lastIndexOf(item)
- finds the last occurrence .   

str.substring(startIndex, endIndex)
- Returns substring starting at startIndex and ending at endIndex - 1.
- The length of the substring is given by endIndex - startIndex.


## String modify operations

str.concat(moreString) 
- Creates a new String that appends the String moreString at the end.

str.replace(findStr, replaceStr)
- Returns a new String in which all occurrences of findStr have been replaced with replaceStr.

str.replace(findChar, replaceChar)
- Returns a new String in which all occurrences of findChar have been replaced with replaceChar.

str1 + str2 
- Returns a new String having str1 with str2 appended. 
- str1 may be a String variable or string literal. Likewise for str2. One of str1 or str2 (not both) may be a character.

str1 += str2 
- Shorthand for str1 = str1 + str2. 
- str1 must be a String variable, and str2 may be a String variable, a string literal, or a character.

## Character operations

Character.isLetter(c)
- true if alphabetic: a-z or A-Z
```java
Character.isLetter('x') // true
Character.isLetter('6') // false
Character.isLetter('!') // false
```

Character.isDigit(c)
- true if digit: 0-9
```java
Character.isDigit('x') // false
Character.isDigit('6') // true
```


Character.isWhitespace(c)
- true if whitespace
```java
Character.isWhitespace(' ')  // true
Character.isWhitespace('\n') // true
Character.isWhitespace('x')  // false
```

Character.toUpperCase(c) 
```java
Character.toUpperCase('a')  // A
Character.toUpperCase('A')  // A
Character.toUpperCase('3')  // 3
```

Character.toLowerCase(c)
```java
Character.toLowerCase('A')  // a
Character.toLowerCase('a')  // a
Character.toLowerCase('3')  // 3
```

==

## Floating-point comparison

- should not be compared using `==`
- set a threshould(e.g. 0.0001)
- `Math.abs()` computes floating-point absolute value

```java
// Determine if double variable x is 98.6.
Math.abs(x - 98.6) < 0.0001;
```

```java
// Determine if double variables x and y are equal. Threshold is 0.0001.
// (If difference is less than 0.0001, values are close enough.)
Math.abs(x - y) < 0.0001;
```

==

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




