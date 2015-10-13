# String

==

## String comparisons

### str.startsWith(prefix)
- Returns true if this string starts with the specified prefix.

### str.endsWith(suffix)
- Returns true if this string ends with the specified suffix.

### str.contains(substring)
- Returns true if this string contains the specified substring.

### str1.equals(str2)
- To compare two strings, always use `str1.equals(str2)` instead of `==`
- Returns true if the two strings are equal

### str1.equalsIgnoreCase(str2)
- Same as equals except that the comparison is case insensitive.

### str1.compareTo(str2)

|Relation               |Returns         |Expression to detect      |
|---                    |---             |---                       |
|str1 less-than str2    |Negative number |str1.compareTo(str2) < 0  |
|str1 equal-to str2     |0               |str1.compareTo(str2) == 0 |
|str1 greater-than str2 |Positive number |str1.compareTo(str2) > 0  |

### str1.compareToIgnoreCase(str2)
- Same as compareTo except that the comparison is case insensitive.

==

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

==

## String modify operations

### str.toUpperCase()
- Returns a new string with all letters in uppercase.

### str.toLowerCase()
- Returns a new string with all letters in lowercase

### str.trim()
- Returns a new string with whitespace characters trimmed on both sides.

### str.concat(moreString) 
- Creates a new String that appends the String moreString at the end.

### str.replace(findStr, replaceStr)
- Returns a new String in which all occurrences of findStr have been replaced with replaceStr.

### str.replace(findChar, replaceChar)
- Returns a new String in which all occurrences of findChar have been replaced with replaceChar.

### str1 + str2 
- Returns a new String having str1 with str2 appended. 
- str1 may be a String variable or string literal. Likewise for str2. One of str1 or str2 (not both) may be a character.

### str1 += str2 
- Shorthand for str1 = str1 + str2. 
- str1 must be a String variable, and str2 may be a String variable, a string literal, or a character.

==

## Finding a Character or a Substring in a String

### index(ch)
- Returns the index of the first occurrence of ch in the string.
- Returns -1 if not matched.

### indexOf(ch, fromIndex)
- Returns the index of the first occurrence of ch after fromIndex in the 
- string.
- Returns -1 if not matched.

### indexOf(s)
- Returns the index of the first occurrence of string s in this string. 
- Returns -1 if not matched.

### indexOf(s, fromIndex)
- Returns the index of the first occurrence of string s in this string after fromIndex. 
- Returns -1 if not matched.

### lastIndexOf(ch)
- Returns the index of the last occurrence of ch in the string. 
- Returns -1 if not matched.

### lastIndexOf(ch, fromIndex)
- Returns the index of the last occurrence of ch before fromIndex in this string.
- Returns -1 if not matched.

### lastIndexOf(s)
- Returns the index of the last occurrence of string s. 
- Returns -1 if not matched.

### lastIndexOf(s, fromIndex)
- Returns the index of the last occurrence of string s before fromIndex. 
- Returns -1 if not matched.

==

## Converting a boolean value to a string
- Use `String.valueOf()`

==

## Splitting a sentence into words
- `str.split("\\s+")`

```java
String data    = scanner.nextLine();
String[] words = data.split("\\s+");
```
