# java_practice_code

==

## String comparisons

### str1.equals(str2)

- to compare two strings, use `str1.equals(str2)` instead of `==`
- returns true if the two strings are equal

### str1.compareTo(str2)

|Relation    |Returns |Expression to detect|
|---|---|---|
|str1 |less-than str2   |Negative number     |str1.compareTo(str2) < 0|
|str1 |equal-to str2    |0   |str1.compareTo(str2) == 0
|str1 |greater-than str2    |Positive number     |str1.compareTo(str2) > 0|


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

isLetter(c)
- true if alphabetic: a-z or A-Z
```java
isLetter('x') // true
isLetter('6') // false
isLetter('!') // false
```

isDigit(c)
- true if digit: 0-9
```java
isDigit('x') // false
isDigit('6') // true
```


isWhitespace(c)
- true if whitespace
```java
isWhitespace(' ')  // true
isWhitespace('\n') // true
isWhitespace('x')  // false
```

toUpperCase(c) 
```java
toUpperCase('a')  // A
toUpperCase('A')  // A
toUpperCase('3')  // 3
```

toLowerCase(c)
```java
toLowerCase('A')  // a
toLowerCase('a')  // a
toLowerCase('3')  // 3
```





