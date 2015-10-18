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


