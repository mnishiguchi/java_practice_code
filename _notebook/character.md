# Character

## Encoding
- Mapping a character to its binary representation
- How characters are encoded is defined by an encoding scheme

==

## Unicode
- Java supports Unicode
- an encoding scheme established by the Unicode Consortium to support the interchange, processing, and display of written texts in the world’s diverse languages
- Unicode includes ASCII code, with `\u0000` to `\u007F` corresponding to the 128 ASCII characters.

### the original 16-bit Unicode characters.
- 16-bit character encoding (65,536 characters)
- **can be stored in a char type variable**
- takes two bytes, preceded by `\u`, expressed in four hexadecimal digits (From `\u0000` to `\uFFFF`)
- not sufficient to represent all the characters in the world

### the supplementary characters
- The Unicode standard has been extended to allow up to 1,112,064 characters to represent all the characters in the world 

==

 ## ASCII (American Standard Code for Information Interchange)
 - an 8-bit encoding scheme for representing all uppercase and lowercase letters, digits, punctuation marks, and control characters. 
 - 

==

## Character operations
- http://docs.oracle.com/javase/7/docs/api/java/lang/Character.html
- isDigit(ch), isLetter(ch), isLetterOfDigit(ch), isLowerCase(ch), isUpperCase(ch), toLowerCase(ch), toUpperCase(ch), etc

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
